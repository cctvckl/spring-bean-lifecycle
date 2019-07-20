package com.ckl.springbeanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

/**
 * desc:
 *
 * @author : caokunliang
 * creat_date: 2019/7/20 0020
 * creat_time: 18:52
 **/
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof DemoController){
            System.out.println();
            System.out.println("BeanPostProcessor:" + "postProcessBeforeInitialization");
            Field field = null;
            try {
                field = bean.getClass().getDeclaredField("iDemoService");
                field.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            try {
                Object o = field.get(bean);
                System.out.println( "属性iDemoService已注入：" + (o != null));
                System.out.println( "属性iDemoService已注入：" + o);
                System.out.println();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof DemoController){
            System.out.println();
            System.out.println("BeanPostProcessor:" + "postProcessAfterInitialization");
            Field field = null;
            try {
                field = bean.getClass().getDeclaredField("iDemoService");
                field.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            try {
                Object o = field.get(bean);
                System.out.println( "属性iDemoService已注入：" + (o != null));
                System.out.println( "属性iDemoService已注入：" + o);
                System.out.println();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return bean;
    }
}
