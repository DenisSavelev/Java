package com.example.Chapter3;

import java.lang.reflect.Field;

public class Fuddifier implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();
        try {      for(int i=0; i < fields.length; i++) {
            if(fields[i].getType().equals(               java.lang.String.class)) {
                fields[i].setAccessible(true);
                String original = (String) fields[i].get(bean);
                fields[i].set(bean, fuddify(original));
            }
        }
        } catch (IllegalAccessException e) {  e.printStackTrace();}    return bean;
    }
    private String fuddify(String orig) {
        if (orig == null) return orig;
        return orig.replaceAll("(r|l)", "w").replaceAll("(R|L)", "W");


    }
    public Object postProcessAfterInitialization (Object bean, String name) throws BeansException {
    return bean;
    }
}

