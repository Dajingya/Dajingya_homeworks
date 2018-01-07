/**
 * Project Name:dt59homework
 * File Name:HomeWork_1.java
 * Package Name:hw20180105
 * Date:2018年1月7日下午7:26:39
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180105;

import hw20180104.Homework_1;

import java.io.File;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午7:26:39 <br/>
 * 
 * @author wangJing
 * @version
 * @see
 */
public class HomeWork_1 {
    private final static Logger LOG = Logger.getLogger(Homework_1.class);

    public static void main(String[] args) {
        printFile(new File("d:\\TEST"));
    }

    public static void printFile(File file) {
        if (file.isFile()) {
            // 如果是文件,输出文件
            LOG.info(file);
        } else {
            File[] fileLists = file.listFiles(); // 如果是目录，获取该目录下的内容集合

            for (int i = 0; i < fileLists.length; i++) { // 循环遍历这个集合内容
                LOG.info(fileLists[i].getName());
                ; // 输出元素名称
                if (fileLists[i].isDirectory()) { // 判断元素是不是一个目录
                    printFile(fileLists[i]); // 如果是目录，继续调用本方法来输出其子目录
                }
            }
        }
    }
}
