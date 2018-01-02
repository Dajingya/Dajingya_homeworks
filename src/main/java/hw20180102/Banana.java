/**
 * Project Name:dt59homework
 * File Name:Banana.java
 * Package Name:hw20180101
 * Date:2018年1月2日下午2:03:56
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
 */

package hw20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午2:03:56 <br/>
 * 
 * @author wangJing
 * @version
 * @see
 */
public class Banana extends Fruit {

    public Banana(String name, String taste) {

        super(name, taste);

    }

    @Override
    public void eatway(String zuofa) {

        this.eatway("做飞饼");// 这是第二题--形参多态

    };
}
