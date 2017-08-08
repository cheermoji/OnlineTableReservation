package com.mojtaba.programming.restaurant.domain.repository;

/**
 *
 *  Created by Moji on 06-Aug-17.
 * @param <TE>
 * @param <T>
 */
public interface Repository<TE, T> extends ReadOnlyRepository<TE, T> {

    /**
     *
     * @param entity
     */
    void add(TE entity);

    /**
     *
     * @param id
     */
    void remove(T id);

    /**
     *
     * @param entity
     */
    void update(TE entity);
}
