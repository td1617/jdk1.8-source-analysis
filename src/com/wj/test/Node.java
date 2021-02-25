package com.wj.test;

/**
 * @Author: wj
 * @Date: 2020/9/16 17:49
 */
public class Node {
    public Object e;   //数据域  存储节点内容
    public Node next;  //引用域，指向后一个节点
    public Node pre;   //引用域 指向前一个节点

    public Node() {

    }

    public Node(Object e) {
        this.e = e;
        next = null;
        pre = null;
    }

}
