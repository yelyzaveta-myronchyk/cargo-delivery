package com.cargodelivery.services;

import com.cargodelivery.domain.Tariff;
import com.cargodelivery.repositories.TariffRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TariffServiceImpl implements TariffService {

    @Resource
    TariffRepository repository;

    @Override
    public List<Tariff> getAll() {
        return repository.findAll();
    }

    @Override
    public void saveTariff(Tariff tariff) {
        repository.save(tariff);
    }
}
