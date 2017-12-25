/**
 * Project Name:dt59homework
 * File Name:Vip.java
 * Package Name:hw20171225
 * Date:2017年12月25日下午5:48:12
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
 */

package hw20171225;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午5:48:12 <br/>
 * 
 * @author wangJing
 * @version
 * @see
 */

public class Vip {

    public static void main(String[] args) {

        System.out.println("请输入你的vip卡类型");
        Vip work = new Vip();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        work.card(i);
        System.out.println("请输入你消费金额");
        double i1 = sc.nextDouble();
        System.out.println("您本次消费：" + i1 + "元，打折后，需支付：" + work.discount(i, i1) + "元");

    }

    void card(int i) {
        switch (i) {
        case 1:
            System.out.println("至尊级");
            break;
        case 2:
            System.out.println("钻石级");
            break;
        case 3:
            System.out.println("铂金级");
            break;
        case 4:
            System.out.println("黄金级");
            break;
        case 5:
            System.out.println("白银级");
            break;
        }
    }

    double discount(int i, double i1) {
        switch (i) {
        case 1:
            return i1 * 0.75;
        case 2:
            return i1 * 0.8;
        case 3:
            return i1 * 0.85;
        case 4:
            return i1 * 0.9;
        default:
            return 0;
        }

    }

}
