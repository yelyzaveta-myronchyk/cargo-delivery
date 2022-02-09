package com.cargodelivery.repositories;

import com.cargodelivery.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepositories extends JpaRepository<Address,Integer> {
}
