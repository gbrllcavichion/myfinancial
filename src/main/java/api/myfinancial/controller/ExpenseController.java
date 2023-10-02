package api.myfinancial.controller;

import api.myfinancial.dto.*;
import api.myfinancial.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @GetMapping("/{userId}")
    public List<Expense> getAllExpenses(@PathVariable String userId) {
        return expenseService.getAllExpenses(userId);
    }

    @PostMapping("/add/{userId}")
    public ResponseEntity<String> addExpense(@PathVariable String userId, @RequestBody Expense expense) {
        Expense addedExpense = expenseService.addExpense(userId, expense);
        return ResponseEntity.ok("Expense added successfully with ID: " + addedExpense.getId());
    }

}
