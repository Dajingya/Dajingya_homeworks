/**
 * Project Name:dt59homework
 * File Name:Computer.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午2:38:08
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午2:38:08 <br/>
 * 
 * @author wangJing
 * @version
 * @see
 */
public interface Computer {
    // 电脑的价钱是4000元
    public static int price = 4000;

    // 电脑的牌子是联想
    public static String brand = "lenovo";

    // 每天用电脑的时间初始值1小时
    public static int time = 1;

    String work();

    int usetime();
}
