package com.geekster.EcommerceApplication.Repository;

import com.geekster.EcommerceApplication.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepository extends JpaRepository<Address, Long> {

}
