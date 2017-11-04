package ru.info.tech.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Sulaymon on 03.11.2017.
 */
@SpringBootApplication
@ComponentScan("ru.info.tech")
@EnableJpaRepositories(basePackages = "ru.info.tech")
@EntityScan("ru.info.tech")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
