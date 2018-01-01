/**
 * Project Name:dt59homework
 * File Name:BigCar.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午3:46:13
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午3:46:13 <br/>
 * 
 * @author wangJing
 * @version
 * @see
 */
public class BigCar extends Car {

    public BigCar(int site) {

        super(site);

    }

    @Override
    public void summary() {
        System.out.println("这是一个大卡车");
    }

    private int shape;

    int site() {
        return 6;
    }

}
