package com.microservice.store.services;

import com.microservice.store.models.Store;

import java.util.List;

public interface StoreService {
    public List<Store> findAll();
    public Store findById(Long id, Integer cantidad);
}
