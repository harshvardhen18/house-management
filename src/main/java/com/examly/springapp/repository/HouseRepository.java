package com.examly.springapp.repository;

import com.examly.springapp.model.House;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends CrudRepository<House,Integer>{
    
}
