/**
 * 壹钱包
 * Copyright (c) 2013-2018 壹钱包版权所有.
 */
package com.rust.dubbomock;

/**
 * @author FUTANGHANG004
 * @version $Id: DemoServiceImpl, v 0.1 2018/5/3  FUTANGHANG004 Exp $
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello :"+name;
    }
}
