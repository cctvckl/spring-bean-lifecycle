package com.ckl.springbeanlifecycle;

import com.ckl.springbeanlifecycle.service.IDemoService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * desc:
 *
 * @author : caokunliang
 * creat_date: 2019/7/20 0020
 * creat_time: 18:45
 **/
//@Controller
public class DemoController implements InitializingBean,DisposableBean {

    @Autowired
    private IDemoService iDemoService;
    
    public DemoController() {
        System.out.println();
        System.out.println("constructor ");
        System.out.println( "属性：" + iDemoService);
        System.out.println();
    }

    @Override
    public void destroy() throws Exception {
        System.out.println();
        System.out.println("implements DisposableBean interface");
        System.out.println( "属性iDemoService已注入：" + (iDemoService != null));
        System.out.println( "属性iDemoService已注入：" + iDemoService);
        System.out.println();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println();
        System.out.println("afterPropertiesSet interface");
        System.out.println( "属性iDemoService已注入：" + (iDemoService != null));
        System.out.println( "属性iDemoService已注入：" + iDemoService);
        System.out.println();
    }

    @PostConstruct
    public void  postConstruct(){
        System.out.println();
        System.out.println("@PostConstrut....");
        System.out.println( "属性iDemoService已注入：" + (iDemoService != null));
        System.out.println( "属性iDemoService已注入：" + iDemoService);
        System.out.println();
    }

    @PreDestroy
    public void  preDestroy(){
        System.out.println();
        System.out.println("@PreDestroy.....");
        System.out.println( "属性iDemoService已注入：" + iDemoService);
        System.out.println();
    }

    public void init(){
        System.out.println();
        System.out.println("init-method by xml 配置文件");
        System.out.println( "属性iDemoService已注入：" + (iDemoService != null));
        System.out.println();
    }
    public void  cleanUp(){
        System.out.println();
        System.out.println("destroy-method by xml 配置文件");
        System.out.println( "属性iDemoService已注入：" + iDemoService);
        System.out.println();
    }
}
