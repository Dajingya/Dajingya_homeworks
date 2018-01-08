/**
 * Project Name:dt59homework
 * File Name:TestAV.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午5:05:16
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午5:05:16 <br/>
 * 
 * @author wangJing
 * @version
 * @see
 */
public class TestAV {

    public static void main(String[] args) {
        for (int i = 1; i < 50; i++) {
            AboutVip av = new AboutVip(0 + i);
            if (i == 50) {
                System.out.print("vip:");
                av.setPriority(Thread.MAX_PRIORITY);
            }
            if (i == 1) {
                System.out.print("最小:");
                av.setPriority(Thread.MIN_PRIORITY);// 最小为什么不靠后呢？还有可能和最大是同一个数，为什么
            }
            av.start();
        }
    }

}
