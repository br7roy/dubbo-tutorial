package com.tak.dubbomock;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Tak
 */
public class Domain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
        context.start();

    }
}
