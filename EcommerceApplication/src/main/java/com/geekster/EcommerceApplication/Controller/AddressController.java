package com.geekster.EcommerceApplication.Controller;

import com.geekster.EcommerceApplication.Model.Address;
import com.geekster.EcommerceApplication.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("Address")
    public String addAllAddress(@RequestBody Address address){
        addressService.addAllAddress(address);
        return"Added";
    }
}
