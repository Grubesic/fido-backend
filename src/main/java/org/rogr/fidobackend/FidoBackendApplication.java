package org.rogr.fidobackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class FidoBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(FidoBackendApplication.class, args);
    }

}
