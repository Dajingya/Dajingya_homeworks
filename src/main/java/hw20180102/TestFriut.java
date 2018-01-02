/**
 * Project Name:dt59homework
 * File Name:TestFriut.java
 * Package Name:hw20180101
 * Date:2018年1月2日下午3:10:11
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
 */

package hw20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午3:10:11 <br/>
 * 
 * @author wangJing
 * @version
 * @see
 */
//
public class TestFriut {

    public static void main(String[] args) {
        abc(new Banana("小黄", "甜的")); // 使用父类的引用指向子类的对象

    }

    // 这是第三题--返回值多态
    // instanceof 是用来判断某个对象是否为某个类的一个实例，如果是，返回true，否则是false
    public static void abc(Fruit fruit1) {

        if (fruit1 instanceof Banana) {
            Banana a = (Banana) fruit1;
            // 如果是，返回true，那么代表这个对象是类Banana的一个实例，就具有Fruit中Banana的特性--做飞饼
            a.eatway("做飞饼");
        }
        if (fruit1 instanceof Grape) {
            Grape a = (Grape) fruit1;
            a.eatway("酿酒");
        }
    }
}