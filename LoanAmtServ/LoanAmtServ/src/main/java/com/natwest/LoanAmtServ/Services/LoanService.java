package com.natwest.LoanAmtServ.Services;

import com.natwest.LoanAmtServ.DTO.InterestRate;
import com.natwest.LoanAmtServ.Entity.Loan;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class LoanService {
    @Autowired
    private RestTemplate restTemplate;
    private static final String SERVICE_NAME = "loan-service";
    private static final String RATE_SERVICE_URL = "http://localhost:9000/api/rate/";
    @CircuitBreaker(name = SERVICE_NAME, fallbackMethod = "getDefaultLoans")
    public Loan getAllLoansByType(String type) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<InterestRate> entity = new HttpEntity<>(null, headers);
        ResponseEntity<InterestRate> response = restTemplate.exchange(
                (RATE_SERVICE_URL + type),
                HttpMethod.GET, entity,
                InterestRate.class
        );
        InterestRate rate = response.getBody();
        //  List<Loan> loanList = new ArrayList<>();
        Loan loan= new Loan();
        if (rate != null) {

            loan.setId(1);
            loan.setAmount(1000.0);
            loan.setType(rate.getType());
            loan.setInterest(loan.getAmount() * (rate.getRateValue() / 100));

        }
        return loan;

    }
    public Loan getDefaultLoans(Exception e) {
        return new Loan(1,"default",100.0,6.6);
    }
}
