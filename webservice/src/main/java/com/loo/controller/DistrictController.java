package com.loo.controller;

import com.codegym.entity.District;
import com.looo.service.DistrictService;
import com.looo.service.DistrictServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DistrictController {
@Autowired
    private DistrictService districtService;

    // Find
//
//    @GetMapping("/district")
//    List<District> findAll() {
//        return districtService.findAll();
//    }
    @GetMapping("/district")
    public ResponseEntity<List<District>> getDistrictList(){
        return new ResponseEntity<>(districtService.findAll(), HttpStatus.OK);
    }
}
