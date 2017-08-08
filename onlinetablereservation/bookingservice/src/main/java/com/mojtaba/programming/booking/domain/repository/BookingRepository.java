package com.mojtaba.programming.booking.domain.repository;

import java.util.Collection;

/**
 *
 *  Created by Moji on 06-Aug-17.
 * @param <Booking>
 * @param <String>
 */
public interface BookingRepository<Booking, String> extends Repository<Booking, String> {

    /**
     *
     * @param name
     * @return
     */
    boolean containsName(String name);

    /**
     *
     * @param name
     * @return
     * @throws Exception
     */
    public Collection<Booking> findByName(String name) throws Exception;
}
