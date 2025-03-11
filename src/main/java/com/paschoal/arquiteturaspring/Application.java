package com.paschoal.arquiteturaspring;

import org.hibernate.id.Configurable;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //SpringApplication.run(Application.class, args);
        //System.out.println("Aplicação startada");
        SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);

        //builder.bannerMode(Banner.Mode.OFF);
        builder.profiles("Produção", "Homologação", "Desenvolvimento");

        builder.run(args);

        //contexto da aplicação já iniciada:
        ConfigurableApplicationContext applicationContext = builder.context();


        //var produtoRepository = applicationContext.getBean("produtoRepository");

        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String applicationNome = environment.getProperty("spring.application.name");
        System.out.println("Nome da aplicação: " + applicationNome);

    }

}
