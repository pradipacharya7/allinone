package com.allinone.practice.services;

import com.allinone.practice.model.Address;
import com.allinone.practice.repository.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AddressServices")
public class AddressServiceImpl implements AddressService {
    @Autowired
    AddressRepo addressRepo;

    public List<Address> findAll(){
        return addressRepo.findAll();
    }
    public Address findById(int id){
        return addressRepo.findById(id);
    }

}
