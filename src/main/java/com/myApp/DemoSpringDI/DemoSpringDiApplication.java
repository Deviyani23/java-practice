package com.myApp.DemoSpringDI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSpringDiApplication {

	public static void main(String[] args) {
	ApplicationContext context= SpringApplication.run(DemoSpringDiApplication.class, args);
//		Dev obj=new Dev();
//		obj.build();
		Dev obj=context.getBean(Dev.class);
		obj.build();
	}


}
