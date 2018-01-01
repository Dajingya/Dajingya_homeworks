/**
 * Project Name:dt59homework
 * File Name:shiXian.java
 * Package Name:hw20171228
 * Date:2018年1月1日下午11:47:31
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
 */
//
package hw20171228;

/**
 * Description: <br/>
 * Date: 2018年1月1日 下午11:47:31 <br/>
 * 
 * @author wangJing
 * @version
 * @see
 */
// 这是第4题
public class smartPhone extends Phone {

    @Override
    public void call() {

        System.out.println("手机打电话");

    } //

    public static void main(String[] args) {
        smartPhone sm = new smartPhone();
        sm.call();
        System.out.println("");
    }

}
