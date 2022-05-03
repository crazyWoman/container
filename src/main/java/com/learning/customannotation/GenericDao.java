package com.learning.customannotation;

import javax.persistence.Entity;
import java.util.Collections;
import java.util.List;

public class GenericDao<E> {
    Class<E> entityClass;
    private String message;

    public Class<E> getEntityClass() {
        return entityClass;
    }

    public void setEntityClass(Class<E> entityClass) {
        this.entityClass = entityClass;
    }

    public List<E> findAll(){
        return Collections.emptyList();
    }

    public String getMessage() {
        return message;
    }
}
