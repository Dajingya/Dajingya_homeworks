/**
 * Project Name:dt59homework
 * File Name:Homework_2.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午2:48:54
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午2:48:54 <br/>
 * 
 * @author wangJing
 * @version
 * @see
 */
public class ListAndMap {
    private final static Logger LOG = Logger.getLogger(ListAndMap.class);

    public static void main(String[] args) {
        List list = new ArrayList();
        // 增

        list.add("我");
        list.add("是");
        list.add("大");
        list.add("京");
        list.add("牙");
        // 获取长度
        int len = list.size();
        LOG.info("长度" + len);
        LOG.info("***********");
        // 获取某个元素
        list.get(0);
        LOG.info("获取第一个值：" + list.get(0));
        LOG.info("获取第二个值：" + list.get(1));
        LOG.info("***********");

        // 获取全部元素（遍历）
        for (int i = 0; i < list.size(); i++) {
            LOG.info(list.get(i));
        }

        // 改
        list.set(0, "你");
        // LOG.info(list.set(0, "你"));
        // 删
        list.remove(4);// 通过位置移除
        LOG.info("***********");
        list.remove("是");// 通过对象移除
        for (int i = 0; i < list.size(); i++) {
            LOG.info(list.get(i));
        }
        list.indexOf(list);
        LOG.info(list.indexOf(list));
        // 查询
        list.get(0);
        LOG.info(list.get(0));// 查询到第一个就是“你”；
        Iterator interator = list.iterator();
        /*
         * while (iterator.hasNext()) {
         * 
         * }
         */
        /*
        
        
        
        
        
        */
        HashMap map = new HashMap();
        // 增
        map.put(001, "王京");
        map.put(002, "王大京");
        LOG.info(map.put(001, "王京"));
        // 删
        map.remove(001);
        LOG.info(map.remove(001));
        // 遍历
        Set keys = map.keySet();
        for (Object key : keys) {
            // LOG.info("键是" + map.keySet());
            System.out.println("键是" + key);
            System.out.println(map.get(key));
        }

    }
}
