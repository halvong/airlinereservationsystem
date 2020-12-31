package com.example.airlinereservationsystem.model.customer;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name="customer")
public class Customer {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min = 1, max=15)
    @NonNull
    @Column(name="first_name")
    private String firstName;

    @Size(min = 1, max=15)
    @NonNull
    @Column(name="last_name")
    private String lastName;

    @NonNull
    @Email
    private String email;

    @NonNull
    private String password;
}
