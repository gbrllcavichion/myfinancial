package api.myfinancial.controller;

import api.myfinancial.dto.*;
import api.myfinancial.service.investment.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@AllArgsConstructor
@RequestMapping("/investments")
public class InvestmentController {

    private final InvestmentService investmentService;

    @PostMapping("/{userId}/add")
    public ResponseEntity<Void> addInvestment(
            @PathVariable String userId,
            @RequestBody Investment investment) {
        investmentService.addInvestment(userId, investment);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<Investment>> getAllInvestments(@PathVariable String userId) {
        List<Investment> investments = investmentService.getAllInvestments(userId);
        return ResponseEntity.ok(investments);
    }
}