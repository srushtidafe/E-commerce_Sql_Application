package com.geekster.EcommerceApplication.Service;

import com.geekster.EcommerceApplication.Model.Address;
import com.geekster.EcommerceApplication.Repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepository addressRepository;

    public void addAllAddress(Address address) {
        addressRepository.save(address);
    }
}
