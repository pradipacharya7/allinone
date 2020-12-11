package com.allinone.practice.services;

import com.allinone.practice.model.Address;

import java.util.List;

public interface AddressService {
    List<Address> findAll();
    Address findById(int id);
}
