package com.example.Chapter3;
import java.lang.String;
import java.util.logging.Logger;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanCounter implements BeanFactoryPostProcessor     {
    private Logger LOGGER = Logger.getLogger(String.valueOf(BeanCounter.class));
    public void postProcessBeanFactory( ConfigurableListableBeanFactory factory) throws BeansException
    {
       // LOGGER.debug("BEAN COUNT: " +  factory.getBeanDefinitionCount());
    }
}
