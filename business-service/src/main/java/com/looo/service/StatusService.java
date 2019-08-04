package com.looo.service;

import com.codegym.entity.Status;

import java.util.List;
import java.util.Optional;

public interface StatusService {
    List<Status> findAll();

    Optional<Status> findById(Long id);
}
