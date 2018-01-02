/**
 * Project Name:dt59homework
 * File Name:Grape.java
 * Package Name:hw20180101
 * Date:2018年1月2日下午2:04:15
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
 */

package hw20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午2:04:15 <br/>
 * 
 * @author wangJing
 * @version
 * @see
 */
public class Grape extends Fruit {

    public Grape(String name, String taste) {

        super(name, taste);

    }

    @Override
    public void eatway(String zuofa) {

        this.eatway("酿酒");

    }

}
