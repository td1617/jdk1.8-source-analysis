package test.classLoad;

/**
 * @Author: wj
 * @Date: 2020/6/11 19:51
 */
public class parent {

    private static int a = 1;

    private int b = 2;

    static {
        a = 2;
        System.out.println("父类a=" + a);
    }

    private void function() {
        System.out.println("父类");
    }
}
