package com.examly.springapp.service;

import java.util.ArrayList;
import java.util.List;

import com.examly.springapp.model.House;
import com.examly.springapp.repository.HouseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseService {
    @Autowired
    HouseRepository houseRepository;


    public List<House> getAllHouse(){
     List<House> houses=new ArrayList<>();
     houseRepository.findAll().forEach(house->houses.add(house));
     return houses;
    }
    public House getHouseByType(String type){
        int id=Integer.parseInt(type);
        return houseRepository.findById(id).get();
    }
    public void delete(int houseId){
        houseRepository.deleteById(houseId);
    }
    public void saveOrUpdate(House house){
        houseRepository.save(house);
    }
    public House getHouseById(int houseId){
        return houseRepository.findById(houseId).get();
    }
    
}
