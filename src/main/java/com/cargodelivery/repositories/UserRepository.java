package com.cargodelivery.repositories;

import com.cargodelivery.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    public User findByLogin(String login);
}
