package com.cargodelivery.domain;

import com.cargodelivery.domain.enums.OrderStatus;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column(updatable = false)
    private int number;
    @Column(nullable = false)
    private LocalDate ordered;
    private LocalDate shipped;
    @OneToOne
    private Address address;
    @Column
    @Enumerated(EnumType.ORDINAL)
    private OrderStatus status;
    @OneToOne
    private Cargo cargo;

    @Column
    private LocalDateTime created;

    @OneToOne
    private Payment payment;

    public Order(int number, LocalDate ordered, LocalDate shipped, Address address, OrderStatus status, double total, Cargo cargo) {
        this.number = number;
        this.ordered = ordered;
        this.shipped = shipped;
        this.address = address;
        this.status = status;
        this.cargo = cargo;
    }

    public Order() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getOrdered() {
        return ordered;
    }

    public void setOrdered(LocalDate ordered) {
        this.ordered = ordered;
    }

    public LocalDate getShipped() {
        return shipped;
    }

    public void setShipped(LocalDate shipped) {
        this.shipped = shipped;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
