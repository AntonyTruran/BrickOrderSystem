package com.caci.BrickOrderSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.caci.BrickOrderSystem.entities.Orders;


@Repository
public class BrickOrderRepo extends JpaRepository<Orders, Long> {

}
