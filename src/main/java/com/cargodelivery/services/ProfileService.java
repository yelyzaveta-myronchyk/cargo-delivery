package com.cargodelivery.services;

import com.cargodelivery.domain.Profile;

import java.util.List;

public interface ProfileService {

    public List<Profile> getAll();
    public void saveProfile (Profile profile);
}
