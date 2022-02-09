package com.cargodelivery.services;

import com.cargodelivery.domain.Profile;
import com.cargodelivery.repositories.ProfileRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.List;

@Service
public class ProfileServiceImpl implements ProfileService{
    @Resource
    ProfileRepository repository;

    @Override
    public List<Profile> getAll(){return repository.findAll();}

    @Override
    public void saveProfile (Profile profile){
        repository.save(profile);
    }
}
