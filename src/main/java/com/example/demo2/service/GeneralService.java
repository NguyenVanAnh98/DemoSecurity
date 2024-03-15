package com.example.demo2.service;

import java.util.Optional;

public interface GeneralService<T> {
    Iterable <T> findAll();
    Optional<T> findById(Long id);
    T save (T t);
    void remove(Long id);

}
