package controller;

import entity.District;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.DistrictService;

import java.util.List;

@RestController
public class DistrictController {

    @Autowired
    private DistrictService districtService;

    @GetMapping("/district")
    public ResponseEntity<List<District>> getDistrictList(){
        return new ResponseEntity<>(districtService.findAll(), HttpStatus.OK);
    }
}
