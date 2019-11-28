package com.druid.eurekedruid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class EurekeDruidApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(EurekeDruidApplication.class, args);
    }
    @Autowired
    DataSource dataSource;
    @Override
    public void run(String... args) throws Exception {
        System.out.println(dataSource.getClass().getName());
        System.out.println("DATASOURCE="+dataSource);
    }
}
