package com.mojtaba.programming.restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 *  Created by Moji on 06-Aug-17.
 */
@SpringBootApplication
@EnableEurekaClient
public class RestaurantApp {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(RestaurantApp.class, args);
    }
}
