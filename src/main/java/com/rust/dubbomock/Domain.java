/**
 * 壹钱包
 * Copyright (c) 2013-2018 壹钱包版权所有.
 */
package com.rust.dubbomock;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author FUTANGHANG004
 * @version $Id: Domain, v 0.1 2018/5/3  FUTANGHANG004 Exp $
 */
public class Domain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
        context.start();

    }
}
