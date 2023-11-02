package com.natwest.RateService.Service;

import com.natwest.RateService.Entity.RateEntitty;
import com.natwest.RateService.Repository.RateRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

@org.springframework.stereotype.Service
public class Service {
//    @Autowired
//    private RateRepo rateRepo;

    public RateEntitty getByType(String type) {
//        return rateRepo.findByType(type).orElse(null);
        RateEntitty pers= new RateEntitty(1,"personal",5.5);
        System.out.println(type);
         if(Objects.equals(type, "personal"))
         {

             return  pers;
         }
         else if(Objects.equals(type, "home")){
             RateEntitty home = new RateEntitty(2,"home",5.1);
             return  home;
         } else if (Objects.equals(type, "business")) {
             RateEntitty business = new RateEntitty(3,"business",4.7);
             return business;
         }
         RateEntitty none = new RateEntitty(4,"Not specified type",6.0);
         return  none;
    }
}
