package api.myfinancial.service.expense;

import api.myfinancial.domain.*;
import api.myfinancial.dto.*;
import lombok.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@AllArgsConstructor
@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private final ExpenseRepository expenseRepository;

    @Autowired
    private final UserRepository userRepository;

    @Override
    public List<Expense> getAllExpenses(String userId) {
        User user = userRepository.findById(userId).orElse(null);

        if (user != null) {
            return user.getExpenses();
        } else {
            throw new IllegalArgumentException("User not found");
        }
    }

    @Override
    public Expense addExpense(String userId, Expense expense) {
        User user = userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("User not found"));

        if (expense.getDate() == null) {
            expense.setDate(new Date());
        }

        user.getExpenses().add(expense);

        Expense addedExpense = expenseRepository.save(expense);

        double expenseAmount = expense.getAmount();
        user.setBalance(user.getBalance() - expenseAmount);
        userRepository.save(user);

        return addedExpense;
    }
}
