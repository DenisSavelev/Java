package com.example.Chapter3;

public interface BeanPostProcessor {
    Object postProcessBeforeInitialization(Object bean, String name) throws BeansException;
    Object postProcessAfterInitialization(Object bean, String name) throws BeansException;
}
