package controller;

import entity.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.RatingService;

@RestController
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @GetMapping("/rating")
    public ResponseEntity<Iterable<Rating>> getAccountList(){
        Iterable<Rating> ratings = ratingService.findAll();

        return new ResponseEntity<>(ratings, HttpStatus.OK);
    }
}
