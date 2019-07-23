package controller;

import entity.Village;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.VillageService;

import java.util.List;

@RestController
public class VillageController {

    @Autowired
    private VillageService villageService;

    @GetMapping("/village")
    public ResponseEntity<List<Village>> getVillageList(){
        return new ResponseEntity<>(villageService.findAll(), HttpStatus.OK);
    }
}
