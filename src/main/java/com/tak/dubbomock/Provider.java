package com.tak.dubbomock;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * @author Tak
 */
public class Provider {
	public static void main(String[] args) throws InterruptedException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"config/dubbo/spring-prov.xml"});
		context.start();
		while (true) {
			System.out.println("waiting");
			SECONDS.sleep(5);
		}


	}

	static class Consumer {
		public static void main(String[] args) {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
					new String[]{"config/dubbo/spring-con.xml"});
			context.start();
			DemoService demoService = (DemoService) context.getBean("demoService");
			for (int i = 0; i < 10; i++) {
				String invoke = demoService.sayHello("jack");
				System.out.println("sayHello方法执行的结果为：" + invoke);
				List<User> users = demoService.getUsers();
				users.forEach(System.out::println);
			}

		}
	}
}
