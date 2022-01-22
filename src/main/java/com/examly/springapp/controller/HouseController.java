package com.examly.springapp.controller;

import java.util.List;

import com.examly.springapp.model.House;
import com.examly.springapp.service.HouseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HouseController {
    @Autowired
    HouseService houseService;

    @PostMapping("/saveHouse")
    private int saveHouse(@RequestBody House house){
        houseService.saveOrUpdate(house);
        return house.getHouseId();
    }

    @GetMapping("/getByType/{type}")
private House getHouseByType(@PathVariable("type") String type){
 return houseService.getHouseByType(type);
}

@DeleteMapping("/deleteHouse/{houseId}")
private void deleteHouse(@PathVariable("houseId") int houseId){
    houseService.delete(houseId);

}
@GetMapping("/getAllHouse")
private List<House> getAllHouse(){
    return houseService.getAllHouse();
}
@GetMapping("/getHouse/{id}")
private House getHouseById(@PathVariable("id") int id){
    return houseService.getHouseById(id);
}
}
