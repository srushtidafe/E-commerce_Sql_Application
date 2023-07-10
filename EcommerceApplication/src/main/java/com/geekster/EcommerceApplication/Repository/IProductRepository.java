package com.geekster.EcommerceApplication.Repository;

import com.geekster.EcommerceApplication.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface IProductRepository extends JpaRepository<Product,Long> {

    @Modifying
    @Transactional
    @Query(value = "select * from product where product.category =:category",nativeQuery = true)
    void findByOrderByCategory(String category);
}
