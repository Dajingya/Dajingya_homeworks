/**
 * Project Name:dt59homework
 * File Name:AboutVip.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午5:02:22
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午5:02:22 <br/>
 * 
 * @author wangJing
 * @version
 * @see
 */
public class AboutVip extends Thread {
    private int VIP;

    public AboutVip(int vIP) {
        VIP = vIP;
    }

    public void run() {
        System.out.println("NO:" + VIP);
    }

}
