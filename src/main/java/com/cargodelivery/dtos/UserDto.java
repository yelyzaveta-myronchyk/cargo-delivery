package com.cargodelivery.dtos;

import com.cargodelivery.domain.Role;
import com.cargodelivery.domain.enums.UserState;

import java.util.Set;

public class UserDto {
    private String login;
    private String password;
    private UserState state;
    private ProfileDTO profileInfo;
    private Set<Role> roles;

    public UserDto(String login, String password, UserState state, ProfileDTO profileInfo, Set<Role> roles) {
        this.login = login;
        this.password = password;
        this.state = state;
        this.profileInfo = profileInfo;
        this.roles = roles;
    }
    public UserDto(){}

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserState getState() {
        return state;
    }

    public void setState(UserState state) {
        this.state = state;
    }

    public ProfileDTO getProfileInfo() {
        return profileInfo;
    }

    public void setProfileInfo(ProfileDTO profileInfo) {
        this.profileInfo = profileInfo;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
