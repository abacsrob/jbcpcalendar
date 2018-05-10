package com.packtpub.springsecurity.jbcpcalendar.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@Component
public class MyWebApplicationInitializer implements ServletContextInitializer {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyWebApplicationInitializer.class);

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        LOGGER.debug("in onStartup()");
    }
}
