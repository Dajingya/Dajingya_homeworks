/**
 * Project Name:dt59homework
 * File Name:Huxury.java
 * Package Name:hw20171228.huxury
 * Date:2018年1月1日下午11:06:56
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
 */

package hw20171228.huxury;

//这是第3题
import hw20171228.Car;

/**
 * Description: <br/>
 * Date: 2018年1月1日 下午11:06:56 <br/>
 * 
 * @author wangJing
 * @version
 * @see
 */
public class Huxury extends Car {
    public Huxury(int site) {

        super(site);

    }

    public void summary() {
        this.setColor("黑色");
        this.setSite(2);
        System.out.println("我是豪车，颜色是" + this.getColor() + "有" + this.getSite() + "个座位");
    }
}
