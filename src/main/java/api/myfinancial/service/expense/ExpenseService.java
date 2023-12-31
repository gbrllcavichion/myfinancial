package api.myfinancial.service.expense;

import api.myfinancial.dto.*;

import java.util.*;

public interface ExpenseService {

    List<Expense> getAllExpenses(String userId);
    Expense addExpense(String userId, Expense expense);

}
