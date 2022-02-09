package com.cargodelivery.repositories;

import com.cargodelivery.domain.Tariff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TariffRepository extends JpaRepository<Tariff, Integer> {
}
