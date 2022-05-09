package com.learning.beanFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Value("${app.version}")
    String version;


    public String getVersion() {
        return version;
    }
}
