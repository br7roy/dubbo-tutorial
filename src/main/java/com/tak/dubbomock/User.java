/*
* Package com.rust.dubbo.dto 
* FileName: User
* Author:   Rust
* Date:     2017/6/28 11:51
*/
package com.tak.dubbomock;

import java.io.Serializable;

/**
 * FileName:    User
 * Author:      Rust
 * Date:        2017/6/28
 * Description:
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age='").append(age).append('\'');
        sb.append(", sex='").append(sex).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
