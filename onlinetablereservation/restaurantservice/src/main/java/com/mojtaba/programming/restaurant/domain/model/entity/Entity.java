package com.mojtaba.programming.restaurant.domain.model.entity;

/**
 *
 *  Created by Moji on 06-Aug-17.
 * @param <T>
 */
public abstract class Entity<T> {

    T id;
    String name;

    /**
     *
     * @return
     */
    public T getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(T id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

}
