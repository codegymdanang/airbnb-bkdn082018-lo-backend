package com.loo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

//@SpringBootApplication
@EnableWebSecurity
@Configuration
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@EntityScan("com.codegym.entity")
@EnableJpaRepositories(basePackages = {"com.codegym.repository"})
@ComponentScan(basePackages = {  "com.codegym.entity", "com.loo.controller","com.loo.config","com.looo.service","com.codegym.repository"})
public class StartBookApplication {

    // start everything
    public static void main(String[] args) {
        SpringApplication.run(StartBookApplication.class, args);
    }

    //@Profile("demo")
//    @Bean
//    CommandLineRunner initDatabase(BookRepository repository) {
//        return args -> {
//            repository.save(new Book("A Guide to the Bodhisattva Way of Life", "Santideva", new BigDecimal("15.41")));
//            repository.save(new Book("The Life-Changing Magic of Tidying Up", "Marie Kondo", new BigDecimal("9.69")));
//            repository.save(new Book("Refactoring: Improving the Design of Existing Code", "Martin Fowler", new BigDecimal("47.99")));
//        };
//    }
}
