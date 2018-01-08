/**
 * Project Name:dt59homework
 * File Name:Lei.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午3:52:08
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午3:52:08 <br/>
 * 
 * @author wangJing
 * @version
 * @see
 */
public class Lei extends Thread {
    int i;

    Lei(int i) {
        this.i = i;
    }

    public void run() {
        System.out.println("NO:" + i);
    }

}
