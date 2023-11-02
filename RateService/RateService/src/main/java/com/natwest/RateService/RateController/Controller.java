package com.natwest.RateService.RateController;

import com.natwest.RateService.Entity.RateEntitty;
import com.natwest.RateService.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    Service service;
    @GetMapping("/api/rate/{type}")
    public ResponseEntity<RateEntitty> GetRates(@PathVariable String type){
        RateEntitty rateEntitty = service.getByType(type);
        return new ResponseEntity<>(rateEntitty, HttpStatus.OK);
    }
}
