/**
 * Project Name:dt59homework
 * File Name:JieKou.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午4:16:36
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午4:16:36 <br/>
 * 
 * @author wangJing
 * @version
 * @see
 */
public class JieKou implements Runnable {

    int i;

    JieKou(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("NO:" + i);
    }

}
