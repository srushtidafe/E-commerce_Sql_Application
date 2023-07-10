package com.geekster.EcommerceApplication.Repository;

import com.geekster.EcommerceApplication.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepository extends JpaRepository<Order,Long> {

}
