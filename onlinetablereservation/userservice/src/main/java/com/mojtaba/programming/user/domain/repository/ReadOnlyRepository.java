package com.mojtaba.programming.user.domain.repository;

import com.mojtaba.programming.user.domain.model.entity.Entity;
import java.util.Collection;

/**
 *
 * com.mojtaba.programming
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
