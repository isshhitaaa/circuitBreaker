package com.natwest.RateService.Entity;




public class RateEntitty {

    Integer id;
   String type;
   Double rateValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getRateValue() {
        return rateValue;
    }

    public void setRateValue(Double rateValue) {
        this.rateValue = rateValue;
    }

    public RateEntitty(Integer id, String type, Double rateValue) {
        this.id = id;
        this.type = type;
        this.rateValue = rateValue;
    }
}
