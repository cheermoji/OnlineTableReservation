package com.mojtaba.programming.restaurant.domain.service;

import com.mojtaba.programming.restaurant.domain.repository.Repository;

/**
 *
 *  Created by Moji on 06-Aug-17.
 * @param <TE>
 * @param <T>
 */
public abstract class ReadOnlyBaseService<TE, T> {

    private Repository<TE, T> repository;

    ReadOnlyBaseService(Repository<TE, T> repository) {
        this.repository = repository;
    }
}
