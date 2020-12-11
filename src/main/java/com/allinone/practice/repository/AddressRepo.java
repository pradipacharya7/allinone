package com.allinone.practice.repository;

import com.allinone.practice.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AddressRepo extends CrudRepository<Address,Integer> {

    List<Address> findAll();
    Address findById(int id);
}
