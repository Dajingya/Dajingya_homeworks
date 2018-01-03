/**
 * Project Name:dt59homework
 * File Name:Teacher.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午2:41:42
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午2:41:42 <br/>
 * 
 * @author wangJing
 * @version
 * @see
 */
public class Teacher implements Computer {

    @Override
    public String work() {

        return "给学生上课";
    }

    @Override
    public int usetime() {

        return 8;
    }

}
