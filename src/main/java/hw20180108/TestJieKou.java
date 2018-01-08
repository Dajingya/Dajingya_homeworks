/**
 * Project Name:dt59homework
 * File Name:TestJieKou.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午4:20:34
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午4:20:34 <br/>
 * 
 * @author wangJing
 * @version
 * @see
 */
public class TestJieKou {

    public static void main(String[] args) {

        JieKou jk1 = new JieKou(1);
        Thread a = new Thread();
        a.start();
        JieKou jk2 = new JieKou(2);
        new Thread(jk2).start();

        JieKou jk3 = new JieKou(3);
        new Thread(jk3).start();
        JieKou jk4 = new JieKou(4);
        new Thread(jk4).start();
        JieKou jk5 = new JieKou(5);
        new Thread(jk5).start();
        JieKou jk6 = new JieKou(6);
        new Thread(jk6).start();
    }

}
