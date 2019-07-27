package com.loo.controller;

import com.codegym.entity.Province;
import com.codegym.entity.Village;
import com.looo.service.ProvinceService;
import com.looo.service.ProvinceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProvinceController {
@Autowired
    private ProvinceService provinceService ;

//
//    @GetMapping("/province")
//    List<Province> findAll() {
//        return provinceService.findAll();
//    }
@GetMapping("/province")
public ResponseEntity<List<Province>> getDistrictList(){
    return new ResponseEntity<>(provinceService.findAll(), HttpStatus.OK);
}
}
