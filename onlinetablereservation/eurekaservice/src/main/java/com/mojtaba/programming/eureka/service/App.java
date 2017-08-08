package com.mojtaba.programming.eureka.service;

/**
 *
 * Created by Moji on 06-Aug-17.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 * Created by Moji on 06-Aug-17.
 */
@SpringBootApplication
@EnableEurekaServer
public class App {

    /**
     *
     * @param args
     */
    public static void main(String[] args)   {
        SpringApplication.run(App.class, args);
    }
}
