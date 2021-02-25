package com.wj.Object.bean;

import java.util.Objects;

/**
 * @Author: wj
 * @Date: 2019/9/23 17:15
 */
public class Person {
    private String pname;
    private int page;

    public Person() {
    }

    public Person(String pname, int page) {
        this.pname = pname;
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Override
    public boolean equals(Object obj) {
        //1、判断比较的两个对象引用是否相等，如果引用相等那么表示是同一个对象，那么当然相等
        if (this == obj) {
            return true;
        }
        //2、如果 otherObject 为 null，直接返回false，表示不相等
        if (null == obj) {
            return false;
        }
        //3、比较 this 和 otherObject 是否是同一个类（注意下面两个只能使用一种）
        //3.1：如果 equals 的语义在每个子类中所有改变，就使用 getClass 检测
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        //3.2：如果所有的子类都有统一的定义，那么使用 instanceof 检测
        if (!(obj instanceof Person)) {
            return false;
        }

        //4、将 otherObject 转换成对应的类类型变量
        Person other = (Person) obj;

        //5、最后对对象的属性进行比较。使用 == 比较基本类型，使用 equals 比较对象。如果都相等则返回true，否则返回false
        //   使用 Objects 工具类的 equals 方法防止比较的两个对象有一个为 null而报错，因为 null.equals() 是会抛异常的
        return Objects.equals(this.pname, other.pname) && this.page == other.page;

        //6、注意如果是在子类中定义equals，则要包含 super.equals(other)
        // return super.equals(other) && Objects.equals(this.pname,other.pname) && this.page == other.page;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Tom", 21);
        Person p2 = new Person("Marry", 20);
        System.out.println(p1 == p2);//false
        System.out.println(p1.equals(p2));//false

        Person p3 = new Person("Tom", 21);
        System.out.println(p1.equals(p3));//true
    }
}
