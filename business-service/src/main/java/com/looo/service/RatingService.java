package com.looo.service;

import com.codegym.entity.Account;
import com.codegym.entity.Rating;

import java.util.List;
import java.util.Optional;

public interface RatingService {
    Iterable<Rating> findAll();
    void save(Rating rating);
    void remove(Long id);
    Optional<Rating> findById(Long id);
    List<Rating> findAllByAccount(Account account);
    List<Rating> findAllByRatingStar(Long star);

}
