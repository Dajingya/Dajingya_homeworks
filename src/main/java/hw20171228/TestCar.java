/**
 * Project Name:dt59homework
 * File Name:TestCar.java
 * Package Name:hw20171228
 * Date:2018年1月1日下午11:38:14
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
 */

package hw20171228;

import hw20171228.huxury.Huxury;

/**
 * Description: <br/>
 * Date: 2018年1月1日 下午11:38:14 <br/>
 * 
 * @author wangJing
 * @version
 * @see
 */
public class TestCar {

    public static void main(String[] args) {

        // Car car=new car();---错误
        Car littleCar = new LittleCar(0);
        Car bigCar = new BigCar(0);
        littleCar.summary();
        bigCar.summary();
        System.out.println();
        Huxury hu = new Huxury(0);
        hu.summary();

    }
}
