package com.ams.app.main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


/**
 * Start of The Applcation
 */
@SpringBootApplication
@EntityScan(basePackages = "com.ams.app.model")
@EnableJpaRepositories("com.ams.app.repositories.")
@ComponentScan("com.ams.app")
public class AmsAppMain {
        /**
         * Main method of AMS App.
         * @param args
         */
        public static void main(String []args){
                SpringApplication.run(AmsAppMain.class);
        }
}
