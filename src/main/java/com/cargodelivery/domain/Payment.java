package com.cargodelivery.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @Column(updatable = false)
    private int id;
    private String details;
    @Column(nullable = false)
    private double total;
    private LocalDate paid;

    public Payment(int id, String details, double total, LocalDate paid) {
        this.id = id;
        this.details = details;
        this.total = total;
        this.paid = paid;
    }
    public Payment(){}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDate getPaid() {
        return paid;
    }

    public void setPaid(LocalDate paid) {
        this.paid = paid;
    }
}
