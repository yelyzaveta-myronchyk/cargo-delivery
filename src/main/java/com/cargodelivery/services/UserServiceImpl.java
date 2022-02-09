package com.cargodelivery.services;

import com.cargodelivery.domain.User;
import com.cargodelivery.dtos.UserDto;
import com.cargodelivery.repositories.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserRepository repository;

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }

    @Override
    public void saveUser(User user) {
        repository.save(user);
    }

    @Override
    public UserDto findUserByLogin(String login) {
        User current = repository.findByLogin(login);
        if (current != null) {
            UserDto currentDto = new UserDto();
            currentDto.setLogin(login);
            currentDto.setPassword(current.getPassword());
            currentDto.setState(current.getState());
            currentDto.setRoles(current.getRoles());
            //currentDto.setProfileInfo(); //fixme add profile dto to user dto
            return currentDto;
        }
        return null;
    }
}
