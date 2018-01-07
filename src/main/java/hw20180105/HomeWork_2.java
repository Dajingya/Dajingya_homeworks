/**
 * Project Name:dt59homework
 * File Name:HomeWork_2.java
 * Package Name:hw20180105
 * Date:2018年1月7日下午8:30:09
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180105;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午8:30:09 <br/>
 * 
 * @author wangJing
 * @version
 * @see
 */

public class HomeWork_2 {
    public static void main(String[] args) {
    

        public static void copyFile(String "d:\\TEST\\wangjing.java"; String "d:\\TEST\\wangjing111.java")
        {
          FileInputStream source;
          FileOutputStream target;
          try
          {
            File f1 = new File("d:\\TEST\\wangjing.java");
            File f2 = new File( "d:\\TEST\\wangjing.java".substring(0,"d:\\TEST\\wangjing111.java".lastIndexOf("/")));
            if(!f2.exists())
            {
              f2.mkdirs();
            }
            f2 = new File(MuDiLuJing);
            source = new FileInputStream(f1);
            target = new FileOutputStream(f2);

            byte[] b=new byte[1024*5];
            int data;
            while ( (data = source.read(b)) != -1)
            {
              target.write(b,0,data);
//            
            }
            source.close();
            target.close();
          }
          catch (Exception ex)
          {
            System.out.print(ex.getMessage());
          }
        }
    }
}
