package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.customer;

@Repository
public interface ICustomerRepo extends JpaRepository<customer, Long> {

}