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
// 抽象类不能被实例化，实例化的工作应该有子类完成
// 抽象方法必须由子类进行重写
// 只要包含一个抽象方法的抽象类，该方法必须要定义成抽象类，不管是否还包含其他方法
// 抽象类中可以包含具体的方法，也可以不包含抽象方法
// 子类中的抽象方法不可以与父类的抽象方法重名
// abstract不能与final并列修饰同一个类
// abstract不能与 private、final、Static、native并列修饰同一个方法
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
