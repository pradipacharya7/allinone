package com.allinone.practice.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotBlank // any characters besides "space"
    @Size(min = 4, max = 50, message = "{Size.name.validation}")
    private String name;
    @Email
    @NotNull
    private String email;
    @NotNull
    private int addressId;

    public Student(int id, @NotBlank @Size(min = 4, max = 50, message = "{Size.name.validation}") String name, @Email @NotNull String email, @NotNull int addressId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.addressId = addressId;
    }

    public Student(){

    }
    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
