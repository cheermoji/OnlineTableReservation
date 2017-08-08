package com.mojtaba.programming.restaurant.domain.repository;

import com.mojtaba.programming.restaurant.domain.model.entity.Entity;
import java.util.Collection;

/**
 *
 *  Created by Moji on 06-Aug-17.
 * @param <TE>
 * @param <T>
 */
public interface ReadOnlyRepository<TE, T> {

    //long Count;
    /**
     *
     * @param id
     * @return
     */
    boolean contains(T id);

    /**
     *
     * @param id
     * @return
     */
    Entity get(T id);

    /**
     *
     * @return
     */
    Collection<TE> getAll();
}
