// 这是第五题
package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午4:27:40 <br/>
 * 
 * @author dingP
 * @version
 * @see
 */
public class testComputer {

    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.setBrand("联想");
        computer.setColor("白色");
        computer.setWeight(2);
        System.out.println("电脑的品牌：" + computer.getBrand());
        System.out.println("电脑的颜色：" + computer.getColor());
        System.out.println("电脑的重量：" + computer.getWeight() + "kg");

    }

}
