package com.wj.Object.bean;

/**
 * @Author: wj
 * @Date: 2019/9/23 17:17
 */
public class Man extends Person {
    private String sex;

    public Man(String pname, int page, String sex) {
        super(pname, page);
        this.sex = sex;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (obj == null || !(obj instanceof Man)) {//对象为空或者不是Man类的实例
            return false;
        }
        Man man = (Man) obj;
        return sex.equals(man.sex);
    }

    public static void main(String[] args) {
        Person p = new Person("Tom", 22);
        Man m = new Man("Tom", 22, "男");

        System.out.println(p.equals(m));//true
        System.out.println(m.equals(p));//false

        Class<? extends String> c = "".getClass();
        System.out.println(c);
    }
}
