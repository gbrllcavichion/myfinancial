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

    @Autowired
    private UserService userService;

    @GetMapping("/{userId}")
    public List<Expense> getAllExpenses(@PathVariable String userId) {
        return expenseService.getAllExpenses(userId);
    }


    @PostMapping("user/{userId}")
    public ResponseEntity<String> addExpenseToUser(@PathVariable String userId, @RequestBody Expense expense) {
        User user = userService.findById(userId).orElse(null);

        if (user != null) {
            user.getExpenses().add(expense);

            expenseService.addExpense(userId, expense);

            userService.update(userId, user);

            return ResponseEntity.ok("Expense added to user successfully.");
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
