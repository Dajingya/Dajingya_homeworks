/**
 * Project Name:dt59homework
 * File Name:Bear.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午2:24:11
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
 */
//这是作业第二题
package hw20171227;

// 这是第2题；

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:24:11 <br/>
 * 
 * @author dingP
 * @version
 * @see
 */

public class Bear_2 {
    int age = 3;

    String sex = "公";

    String color = "棕色";

    public Bear_2() {

        this.age = 2;
        this.sex = "母";
        this.color = "红色";
    }

    public static void main(String[] args) {
        Bear_2 bear_2 = new Bear_2();
        System.out.println(bear_2.age);
        System.out.println(bear_2.sex);
        System.out.println(bear_2.color);

    }
}
