package com.cargodelivery.services;

import com.cargodelivery.domain.User;
import com.cargodelivery.dtos.UserDto;

import java.util.List;

public interface UserService {
    public List<User> getAll();
    public void saveUser(User user);
    public UserDto findUserByLogin(String login );

}
