package com.natwest.LoanAmtServ.Controller;

import com.natwest.LoanAmtServ.Entity.Loan;
import com.natwest.LoanAmtServ.Services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    LoanService loanService;
    @GetMapping("/loans")
    public ResponseEntity<Loan> getLoansByType(@RequestParam String type) {
        System.out.println(type);
        return ResponseEntity.ok().body(loanService.getAllLoansByType(type));
    }
}