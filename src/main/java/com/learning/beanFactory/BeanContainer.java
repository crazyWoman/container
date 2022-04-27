package com.learning.beanFactory;

import com.learning.container.ContainerApplication;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication

public class BeanContainer {
    public static void main(String[] args) {
        {
          ApplicationContext context= SpringApplication.run(BeanContainer.class, args);
            Person person =  (Person) context.getBean(Person.class);
            System.out.println(person.getAge());
            System.out.println(person.getName());

        }
        }

}
