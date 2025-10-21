package com.cesarlead.innovatec.banco;

import com.cesarlead.innovatec.banco.service.PortafolioService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class CustomerServicesApplication {

    private PortafolioService portafolioService;
    public CustomerServicesApplication(PortafolioService portafolioService){
        this.portafolioService = portafolioService;
    }

     static void main(String[] args) {
        SpringApplication.run(CustomerServicesApplication.class, args);
    }


}
