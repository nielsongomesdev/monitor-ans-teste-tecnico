package com.intuitive.teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesteEstagioApplication {

    public static void main(String[] args) {
        SpringApplication.run(TesteEstagioApplication.class, args);
        System.out.println("Servidor Spring Boot rodando na porta 8080!");
    }
}