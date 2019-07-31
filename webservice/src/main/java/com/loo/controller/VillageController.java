package com.loo.controller;

import com.codegym.entity.Village;
import com.looo.service.VillageService;
import com.looo.service.VillageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Validated
public class VillageController {
@Autowired
    private VillageService villageService ;
    @GetMapping("/village")
    public ResponseEntity<List<Village>> getVillageList(){
        return new ResponseEntity<>(villageService.findAll(), HttpStatus.OK);
       }
}
