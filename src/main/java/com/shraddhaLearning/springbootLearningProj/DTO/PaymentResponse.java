package com.shraddhaLearning.springbootLearningProj.DTO;

public class PaymentResponse {
    private Long paymentId;
    private double amount;
    private String currency;

    // now getter and setter
    public Long getPaymentId(){ return paymentId; }
    public void setPaymentId(Long paymentId){ this.paymentId = paymentId; }
    public double getAmount(){ return amount; }
    public void setAmount(double amount){ this.amount = amount; }
    public String getCurrency(){ return currency; }
    public void setCurrency(String currency){ this.currency = currency; }
}
