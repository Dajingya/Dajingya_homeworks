/**
 * Project Name:dt59homework
 * File Name:LittleCar.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午3:45:55
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午3:45:55 <br/>
 * 
 * @author wangJing
 * @version
 * @see
 */

public class LittleCar extends Car {

    public LittleCar(int site) {

        super(site);

    }// 这是第一题

    String name = "路虎";

    int price = 1000000;

    // 这是第二题
    public void Run() {
        System.out.println("这是一台" + name + ",它的价格是" + price + "它是" + this.getSite() + "座" + "它的颜色是" + this.getColor());
    }

}
