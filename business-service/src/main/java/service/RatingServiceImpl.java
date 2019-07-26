package service;

import entity.Account;
import entity.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import repository.RatingRepository;

import java.util.List;
import java.util.Optional;

public class RatingServiceImpl implements RatingService{

    @Autowired
    RatingRepository ratingRepository;
    @Override
    public Iterable<Rating> findAll() {
        return ratingRepository.findAll();
    }

    @Override
    public void save(Rating rating) {
        ratingRepository.save(rating);
    }

    @Override
    public void remove(Long id) {
        ratingRepository.deleteById(id);
    }

    @Override
    public Optional<Rating> findById(Long id) {
        return ratingRepository.findById(id);
    }

    @Override
    public List<Rating> findAllByAccount(Account account) {
        return ratingRepository.findAllByAccount(account);
    }

    @Override
    public List<Rating> findAllByRatingStar(Long star) {
        return ratingRepository.findAllByRatingStar(star);
    }
}
