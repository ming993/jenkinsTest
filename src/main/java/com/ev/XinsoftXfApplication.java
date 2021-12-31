package com.ev;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;

@ServletComponentScan
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@EnableCaching
@EnableScheduling
@EnableSwagger2
public class XinsoftXfApplication implements CommandLineRunner {




    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(com.ev.XinsoftXfApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
    }
}