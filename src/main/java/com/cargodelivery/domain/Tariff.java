package com.cargodelivery.domain;

import com.github.javafaker.Faker;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "tariff")
public class Tariff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Size(min=3, max=12, message = "Wrong Tariff Name!!")
    private String name;
    @Max(200)
    private double basePrice;
    private LocalDate created;
    private LocalDate updated;
    @Max(200)
    @Min(50)
    private double maxValume;

    @Max(500)
    @Min(5)
    private double maxWeight;

    public Tariff() {
        this.name = "Some tariff name";
    }

    public Tariff(int id, String name, double basePrice, LocalDate created, LocalDate updated, double maxValume, double maxWeight) {
        this.id = id;
        this.name = name;
        this.basePrice = basePrice;
        this.created = created;
        this.updated = updated;
        this.maxValume = maxValume;
        this.maxWeight = maxWeight;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public LocalDate getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDate updated) {
        this.updated = updated;
    }

    public double getMaxValume() {
        return maxValume;
    }

    public void setMaxValume(double maxValume) {
        this.maxValume = maxValume;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public static Tariff getInstance() {
        Faker faker = new Faker();

        Tariff current = new Tariff();
        current.id = faker.random().nextInt(10000);
        current.basePrice = faker.random().nextInt(10, 1000);
        current.maxValume = faker.random().nextInt(100);
        current.maxWeight = faker.random().nextInt(100);
        current.name = faker.gameOfThrones().house();
        current.created = LocalDate.now().minusDays(faker.random().nextInt(20));
        current.updated = LocalDate.now().plusDays(faker.random().nextInt(20));

        return current;


    }

}

