package com.example.propertytest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Dao extends JpaRepository<Owner, Integer> {

	
}
