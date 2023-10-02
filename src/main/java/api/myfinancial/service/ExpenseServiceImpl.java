package api.myfinancial.service;

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
        return expenseRepository.findAll();
    }

    //todo:
    @Override
    public Expense addExpense(String userId, Expense expense) {
        return null;
    }
}
