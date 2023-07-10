package com.geekster.EcommerceApplication.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;
    private String LandMark;
    private String city;
    private String zipCode;
    private String state;
    @OneToOne
    @JoinColumn(name = "fk_user-id")
    private User user;

}
