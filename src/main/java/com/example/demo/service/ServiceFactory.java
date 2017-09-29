package com.example.demo.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import static org.springframework.util.Assert.notEmpty;

@Service
public class ServiceFactory implements ApplicationContextAware {
    private static ApplicationContext context;

    public static Object getSpringBean(String beanName) {
        return context == null ? null : context.getBean(beanName);
    }

    public static <T> T getSpringBean(Class<T> tClass) {
        return context == null ? null : context.getBean(tClass);
    }

    public static String[] getBeanDefinitionNames() {
        return context.getBeanDefinitionNames();
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        ServiceFactory.context = context;
    }

}
