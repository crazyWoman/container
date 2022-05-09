package com.learning.beanFactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class BeanfactoryTest implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("****************BeanfactoryTestBeanfactoryTest");
        BeanDefinition person = configurableListableBeanFactory.getBeanDefinition("person");
        System.out.println("****************BeanfactoryTestBeanfactoryTest11"+person);
        System.out.println("****************BeanfactoryTestBeanfactoryTest11"+person.hasPropertyValues());
        MutablePropertyValues propertyValues = person.getPropertyValues();
        propertyValues.add("version","20.0");
        propertyValues.add("name","mike");



    }
}
