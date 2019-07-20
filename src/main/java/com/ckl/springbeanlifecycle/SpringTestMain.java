package com.ckl.springbeanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTestMain {
	public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Object demoController = ctx.getBean(DemoController.class);

        ctx.registerShutdownHook();
//        ctx.destroy();

	}

}
