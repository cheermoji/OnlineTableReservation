package com.mojtaba.programming.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 * com.mojtaba.programming
 */
@SpringBootApplication
@EnableEurekaClient
public class UsersApp {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(UsersApp.class, args);
    }

}
