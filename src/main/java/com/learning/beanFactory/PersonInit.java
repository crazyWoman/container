package com.learning.beanFactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
@Service
public class PersonInit  {
    @Autowired
    Person person;

    @PostConstruct
    public void init(){
        System.out.println("*********after bean instaantiated");
        person.setName("Rohan Perumalil");
    }

}
