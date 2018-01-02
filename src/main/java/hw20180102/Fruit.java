/**
 * Project Name:dt59homework
 * File Name:Fruit.java
 * Package Name:hw20180101
 * Date:2018年1月2日下午2:03:38
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
 */

package hw20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午2:03:38 <br/>
 * 
 * @author wangJing
 * @version
 * @see
 */
public abstract class Fruit {
    public Fruit(String name, String taste) {

    }

    private String name;

    private String taste;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public abstract void eatway(String zuofa);// 抽象方法
}
