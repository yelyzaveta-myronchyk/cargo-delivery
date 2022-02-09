package com.cargodelivery.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "profiles")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 15)
    private String firstname;
    @Column(nullable = false, length = 15)
    private String lastname;
    @Column(nullable = false, length = 35)
    private String mail;
    @Column(nullable = false, length = 13)
    private String phone;
    @Column(nullable = false)
    private LocalDate bday;
    @OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<Order> orders;

    public Profile(int id, String firstname, String lastname, String mail, String phone, String bday) {
        this.orders = new ArrayList<>();
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.mail = mail;
        this.phone = phone;
        this.bday = LocalDate.parse(bday, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public Profile() {
        this.orders = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBday() {
        return bday;
    }

    public void setBday(LocalDate bday) {
        this.bday = bday;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", mail='" + mail + '\'' +
                ", phone='" + phone + '\'' +
                ", bday='" + bday + '\'' +
                '}';
    }

}
