package com.cargodelivery.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

public class UserSingUpDto {

//    @Pattern(regexp = "")
    private String phone;
    private String password;
    private String passwordConfirmation;
    private String firstname;
    private String lastname;
    private String bday;
    @Email
    private String mail;

    private UserSingUpDto() {
    }

    public UserSingUpDto(String phone, String password, String passwordConfirmation, String firstname, String lastname, String bday, String mail) {
        this.phone = phone;
        this.password = password;
        this.passwordConfirmation = passwordConfirmation;
        this.firstname = firstname;
        this.lastname = lastname;
        this.bday = bday;
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBday() {
        return bday;
    }

    public void setBday(String bday) {
        this.bday = bday;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPasswordConfirmation() {
        return passwordConfirmation;
    }

    public void setPasswordConfirmation(String passwordConfirmation) {
        this.passwordConfirmation = passwordConfirmation;
    }

    @Override
    public String toString() {
        return "UserSingUpDto{" +
                "phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", passwordConfirmation='" + passwordConfirmation + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", bday='" + bday + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
