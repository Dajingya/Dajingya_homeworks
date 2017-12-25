/**
 * Project Name:dt59homework
 * File Name:a_1.java
 * Package Name:hw20171225
 * Date:2017年12月25日下午5:12:41
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
 */

package hw20171225;

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午5:12:41 <br/>
 * 
 * @author wangJing
 * @version
 * @see
 */
public class Bidaxiao {

    public static void main(String[] args) {

        Bidaxiao bidaxiao = new Bidaxiao();
        int c = bidaxiao.compare(12, 3);
        System.out.println(c);
    }

    int compare(int a, int b) {
        int sum = a - b;
        if (sum > 0) {
            return a;
        } else {

            return b;
        }
    }

}
