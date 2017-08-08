package com.mojtaba.programming.restaurant.domain.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigInteger;

/**
 *
 *  Created by Moji on 06-Aug-17.
 */
public class Table extends BaseEntity<BigInteger> {

    private int capacity;

    /**
     *
     * @param name
     * @param id
     * @param capacity
     */
    public Table(@JsonProperty("name") String name, @JsonProperty("id") BigInteger id, @JsonProperty("capacity") int capacity) {
        super(id, name);
        this.capacity = capacity;
    }

    /**
     *
     * @param capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     *
     * @return
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Overridden toString() method that return String presentation of the
     * Object
     *
     * @return
     */
    @Override
    public String toString() {
        return new StringBuilder("{id: ").append(id).append(", name: ")
                .append(name).append(", capacity: ").append(capacity).append("}").toString();
    }

}
