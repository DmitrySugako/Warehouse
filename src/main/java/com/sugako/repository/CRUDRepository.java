package com.sugako.repository;

import java.util.List;

public interface CRUDRepository<K, T> {

    T findOne(K id);

    List<T> findAll();

    void create(T object);

    T update(T object);

    void delete(K id);
}
