package com.cargodelivery.domain;

import com.cargodelivery.domain.enums.UserRole;
import com.cargodelivery.domain.enums.UserState;
import lombok.Builder;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    private String login;
    @Column(nullable = false, length = 20)
    private String password;
    @Column
    @Enumerated
    private UserState state;
    @OneToOne(fetch = FetchType.EAGER)
    private Profile profileInfo;

    @OneToMany
    private Set<Role> roles;

    public User(String login, String password, UserState state, Profile profileInfo) {
        this.login = login;
        this.password = password;
        this.state = state;
        this.profileInfo = profileInfo;
    }

    public User() {
    }

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

    public Profile getProfileInfo() {
        return profileInfo;
    }

    public void setProfileInfo(Profile profileInfo) {
        this.profileInfo = profileInfo;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
