package org.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = {"org.domain"})
@EnableJpaRepositories(basePackages = {"org.cloud.repository"})
@ComponentScan(basePackages = {"org.domain", "org.cloud", "org.dto"})
public class App {


    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
