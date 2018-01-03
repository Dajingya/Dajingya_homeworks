/**
 * Project Name:dt59homework
 * File Name:Exception.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午3:02:22
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午3:02:22 <br/>
 * 
 * @author wangJing
 * @version
 * @see
 */
public class ExceptionExample {
    private final static Logger LOG = Logger.getLogger(ExceptionExample.class);

    public static void main(String[] args) {

        String str = null;
        try {
            if (str.equals("王")) {
            }

        } catch (NullPointerException e) {
            e.printStackTrace();
            LOG.info(str + "--空指针异常");
            throw e;
        }
        // System.out.println(str);
        ;
    }
}
