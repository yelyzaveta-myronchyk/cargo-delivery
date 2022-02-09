package com.cargodelivery;

import com.cargodelivery.domain.Address;
import com.cargodelivery.repositories.AddressRepositories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class CargoDeliveryApplication implements CommandLineRunner {
    @Resource
    AddressRepositories addressRep;

    public static void main(String[] args) {
        SpringApplication.run(CargoDeliveryApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
    Address someAddress = new Address("Ukraine", "Kharkiv", "Lenin Str", "245 a", 2410);
    addressRep.save(someAddress);
    }
}
