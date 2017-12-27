//这是第6题
package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午4:42:52 <br/>
 * 
 * @author dingP
 * @version
 * @see
 */
public class testBottle {

    public static void main(String[] args) {
        // 有static调用时可直接用类名加点；
        Bottle.weight = 3;
        // 无static时，需要创建一个实体对象；用对象名加点来调用
        Bottle bottle2 = new Bottle(3, "白色");
        bottle2.color = "白色";
        System.out.println(Bottle.weight);// 因为只有weight前面加了Static，此处只能调用weight
        // System.out.println(Bottle.color);// color前面无static,此处不能调用，报错

    }

}
