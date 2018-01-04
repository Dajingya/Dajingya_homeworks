/**
 * Project Name:dt59homework
 * File Name:Homework_1.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午2:48:35
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午2:48:35 <br/>
 * 
 * @author wangJing
 * @version
 * @see
 */
public class Homework_1 {

    private final static Logger LOG = Logger.getLogger(Homework_1.class);

    public static void main(String[] args) {

        String str = "       有 一只大京牙   ";
        String str1 = str.trim();
        int str2 = str.hashCode();
        int str3 = str.indexOf(str1);
        int str4 = str.length();
        boolean str5 = str.equals("王京");
        LOG.info(str1);// 返回字符串的副本，忽略前导空白和尾部空白--- 有 一只大京牙；首尾空格没有了
        LOG.info(str2);// 返回此字符串的哈希码---322759885
        LOG.info(str3);// 返回指定子字符串在此字符串中第一次出现处的索引--7
        LOG.info(str4);// 返回此字符串的长度。
        LOG.info(str5);// 将此字符串与指定的对象比较。
    }

}
