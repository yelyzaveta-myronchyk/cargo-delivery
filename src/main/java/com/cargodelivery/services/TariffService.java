package com.cargodelivery.services;

import com.cargodelivery.domain.Tariff;

import java.util.List;

public interface TariffService {
    public List<Tariff> getAll();
    public void saveTariff(Tariff tariff);
}
