// 这是第三题
package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午3:18:49 <br/>
 * 
 * @author wangJing
 * @version
 * @see
 */
public class testDoor {

    public static void main(String[] args) {
        int age = 3;
        String name = "王京";
        String color = "黑色";

        Door door = new Door(age, name, color);
        System.out.println(door.age);
        System.out.println(door.color);
        System.out.println(door.name);
    }

}
