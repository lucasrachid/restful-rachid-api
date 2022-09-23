package com.restful.rachidapi;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication(scanBasePackages = {"com.restful.rachidapi"})
@RequiredArgsConstructor
@Slf4j
public class RachidApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RachidApiApplication.class, args);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("restful-rachid-api-jpa");
        EntityManager em = emf.createEntityManager();

    }

}
