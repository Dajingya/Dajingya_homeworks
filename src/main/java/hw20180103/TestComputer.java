/**
 * Project Name:dt59homework
 * File Name:TestComputer.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午2:48:37
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午2:48:37 <br/>
 * 
 * @author wangJing
 * @version
 * @see
 */
public class TestComputer {

    public static void main(String[] args) {

        Computer people1 = new Teacher();
        Computer people2 = new Student();
        String a = people1.work();
        int b = people1.usetime();

        String m = people2.work();
        int n = people2.usetime();
        System.out.println("老师每天使用电脑" + a + b + "小时");
        System.out.println("学生每天使用电脑" + m + n + "小时");

    }
}
