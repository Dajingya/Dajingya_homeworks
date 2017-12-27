// 这是第四题
package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午3:34:16 <br/>
 * 
 * @author dingP
 * @version
 * @see
 */
public class Student {
    String name = "王京";

    int number = 123;

    String banji = "2班";

    char sex = '女';

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int number) {
        this.name = name;
        this.number = number;

    }

    public Student(String name, int number, char sex) {
        this.name = name;
        this.number = number;
        this.sex = sex;
    }
}
