/**
 * Project Name:dt59homework
 * File Name:Main.java
 * Package Name:dt59homework
 * Date:2017年12月24日下午2:09:19
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
 */

package dt59homework;

/**
 * Description: <br/>
 * Date: 2017年12月24日 下午2:09:19 <br/>
 * 
 * @author dingP
 * @version
 * @see
 */
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.kind = "泰迪";
        dog1.color = "棕色";
        dog1.name = "毛毛";
        dog1.weight = 5;
        System.out.println("狗狗品种：" + dog1.kind);
        System.out.println("狗狗颜色：" + dog1.color);
        System.out.println("狗狗体重：" + dog1.weight + "kg");
    }

}
