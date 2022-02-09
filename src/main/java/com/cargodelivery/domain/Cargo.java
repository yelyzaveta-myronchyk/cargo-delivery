package com.cargodelivery.domain;

import com.cargodelivery.domain.enums.CargoType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cargoes")
public class Cargo {
    @Id
    @Column(updatable = false)
    private String number;

    @Column
    @Enumerated
    @ElementCollection(targetClass = CargoType.class)
    private List<CargoType> types = new ArrayList<>();
    private String info;
    @Column(nullable = false)
    private double length;
    @Column(nullable = false)
    private double height;
    @Column(nullable = false)
    private double width;
    @Column(nullable = false)
    private double weight;

    @OneToOne
    private Tariff tariff;


    public Cargo(String number, CargoType[] types, String info, double length, double height, double width, double weight, Address deliveryAddress) {
        this.number = number;
//        this.types = types;
        this.info = info;
        this.length = length;
        this.height = height;
        this.width = width;
        this.weight = weight;
//        this.deliveryAddress = deliveryAddress;
    }

    public Cargo() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


}
