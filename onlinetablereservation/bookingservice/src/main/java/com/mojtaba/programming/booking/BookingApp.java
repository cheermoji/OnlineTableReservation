package com.mojtaba.programming.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 *  Created by Moji on 06-Aug-17.
 */
@SpringBootApplication
@EnableEurekaClient
public class BookingApp {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(BookingApp.class, args);
    }

}
