/**
 * Project Name:dt59homework
 * File Name:Car.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午3:08:39
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午3:08:39 <br/>
 * 
 * @author wangJing
 * @version
 * @see
 */
public abstract class Car {

    private int site = 4;

    private String color = "白色";

    public void summary() {
        System.out.println("这是一个车");
    }

    public Car(int site) {

    }

    public int getSite() {
        return site;
    }

    public void setSite(int site) {
        this.site = site;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(int site, String color) {

    }

}
