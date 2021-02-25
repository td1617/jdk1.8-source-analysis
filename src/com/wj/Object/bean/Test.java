package com.wj.Object.bean;
import java.lang.Integer;
/**
 * @Author: wj
 * @Date: 2019/9/24 11:14
 */
public class Test {

    public static void main(String[] args) {
        Integer a = 1;//Integer a = Integer.valueOf(1);
        Integer b = 2;//Integer b = Integer.valueOf(2);
        Integer c = 3;//Integer c = Integer.valueOf(3);
        Integer d = 3;//Integer d = Integer.valueOf(3);

        Integer e = 321;//Integer e = Integer.valueOf(321);
        Integer f = 321;//Integer f = Integer.valueOf(321);

        Long g = 3L;//Long g = Long.valueOf(3L);
        Long h = 2L;//Long h = Long.valueOf(2L);

//        System.out.println(c == d);//true
//        System.out.println(e == f);//false
//        System.out.println(c == (a + b));//true
//        System.out.println(c.equals((a+b)));//true
//        System.out.println(g == (a+b));//true
//        System.out.println(g.equals(a+b));//false
//        System.out.println(g.equals(a+h));//true

        //　分析：第一个和第二个结果没什么疑问，Integer类在-128到127的缓存问题；
        //
        //　　第三个由于  a+b包含了算术运算，因此会触发自动拆箱过程（会调用intValue方法）,==比较符又将左边的自动拆箱，因此它们比较的是数值是否相等。
        //
        //　　第四个对于c.equals(a+b)会先触发自动拆箱过程，再触发自动装箱过程，也就是说a+b，会先各自调用intValue方法，得到了加法运算后的数值之后，便调用Integer.valueOf方法，再进行equals比较。
        //
        //　　第五个对于 g == (a+b)，首先计算 a+b,也是先调用各自的intValue方法，得到数值之后，由于前面的g是Long类型的，也会自动拆箱为long，==运算符能将隐含的将小范围的数据类型转换为大范围的数据类型，也就是int会被转换成long类型，两个long类型的数值进行比较。
        //
        //　　第六个对于 g.equals(a+b),同理a+b会先自动拆箱，然后将结果自动装箱，需要说明的是 equals 运算符不会进行类型转换。所以是Long.equals(Integer)，结果当然是false
        //
        //　　第七个对于g.equals(a+h),运算符+会进行类型转换，a+h各自拆箱之后是int+long，结果是long，然后long进行自动装箱为Long，两个Long进行equals判断。

        System.out.println(new Integer("a"));
    }
}
