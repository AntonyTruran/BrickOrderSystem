package com.caci.BrickOrderSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.caci.BrickOrderSystem.entities.BrickOrder;


@Repository
public interface BrickOrderRepo extends JpaRepository<BrickOrder, String> {

}
