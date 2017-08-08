package com.mojtaba.programming.user.domain.service;

import com.mojtaba.programming.user.domain.repository.Repository;

/**
 *
 * com.mojtaba.programming
 * @param <TE>
 * @param <T>
 */
public abstract class ReadOnlyBaseService<TE, T> {

    private Repository<TE, T> repository;

    ReadOnlyBaseService(Repository<TE, T> repository) {
        this.repository = repository;
    }
}
