package com.cesarlead.innovatec.banco;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.cesarlead.innovatec.banco")
public class CustomerServicesApplication {

     static void main(String[] args) {
        SpringApplication.run(CustomerServicesApplication.class, args);
    }

}
