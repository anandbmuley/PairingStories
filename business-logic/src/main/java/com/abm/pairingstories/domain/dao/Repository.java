package com.abm.pairingstories.domain.dao;

import com.abm.lambdacollections.core.AdvancedSet;

public interface Repository<T> {

    AdvancedSet<T> getAll();

    T save(T t);
}
