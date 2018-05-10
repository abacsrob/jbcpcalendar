package com.packtpub.springsecurity.jbcpcalendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.packtpub.springsecurity.jbcpcalendar")
public class JbcpcalendarApplication {

    public static void main(String[] args) {
        SpringApplication.run(JbcpcalendarApplication.class, args);
    }
}
