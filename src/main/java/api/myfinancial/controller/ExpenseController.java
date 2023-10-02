package api.myfinancial.controller;

import api.myfinancial.dto.*;
import api.myfinancial.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @PostMapping("/add")
    public ResponseEntity<String> addExpense(@RequestBody Expense expense) {
        return ResponseEntity.ok("Expense added successfully");
    }
}
