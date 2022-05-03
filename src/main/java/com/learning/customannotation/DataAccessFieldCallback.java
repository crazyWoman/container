package com.learning.customannotation;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.*;

public class DataAccessFieldCallback implements ReflectionUtils.FieldCallback {


    private ConfigurableListableBeanFactory configurableListableBeanFactory;
    private Object bean;

    @Override
    public void doWith(Field field) throws IllegalArgumentException, IllegalAccessException {

        if(!field.isAnnotationPresent(DataAccess1.class)){
            return;

        }else{
            ReflectionUtils.makeAccessible(field);
            final Type fieldGenericType = field.getGenericType();
            final Class generic = field.getType();
            final Class entityClass = field.getDeclaredAnnotation(DataAccess1.class).entity();
            if(isGenericTypeValid(entityClass,fieldGenericType)){

                String beanName = entityClass.getSimpleName().concat(generic.getSimpleName());

            }
        }

    }

    public boolean isGenericTypeValid(final Class<?> clazz, final Type field){
        if(field instanceof ParameterizedType) {
            final ParameterizedType parameterizedType = (ParameterizedType) field;
            Type type = parameterizedType.getActualTypeArguments()[0];
            return type.equals(clazz);
        }
        return false;
    }

    public final Object getBeanInstance(final String beanName, final Class<?> genericClass, final Class<?> paramClass) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Object daoInstance = null;
        if(!configurableListableBeanFactory.containsBean(beanName)){
            Object toRegister = null;
            final Constructor constructor = genericClass.getConstructor(Class.class);
            toRegister = constructor.newInstance(paramClass);
            daoInstance = configurableListableBeanFactory.initializeBean(toRegister,beanName);
            configurableListableBeanFactory.autowireBeanProperties( daoInstance,AutowireCapableBeanFactory.AUTOWIRE_BY_NAME,true);
            configurableListableBeanFactory.registerSingleton(beanName,daoInstance);
        }else{
            System.out.println("bean already exists");
        }
     return daoInstance;
    }
}
