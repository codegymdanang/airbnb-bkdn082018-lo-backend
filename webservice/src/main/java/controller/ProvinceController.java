package controller;

import entity.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ProvinceService;

import java.util.List;

@RestController
public class ProvinceController {
    @Autowired
    private ProvinceService provinceService;

    @GetMapping("/province")
    public ResponseEntity<List<Province>> getDistrictList(){
        return new ResponseEntity<>(provinceService.findAll(), HttpStatus.OK);
    }
}
