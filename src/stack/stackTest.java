package stack;

import java.util.Stack;

/**
 * 栈测试
 *
 * @Author: wj
 * @Date: 2019/10/9 16:13
 */
public class stackTest {
    public static void main(String[] args) {
        //后进先出
//        Stack stack = new Stack();
//        String str = "how are you";
//        char[] cha = str.toCharArray();
//        for(char c : cha){
//            stack.push(c);
//        }
//        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
//        }

        Stack stack = new Stack();
        String str = "12<a[b{c}]>";
        char[] cha = str.toCharArray();
        for (char c : cha) {
            switch (c) {
                case '{':
                case '[':
                case '<':
                    stack.push(c);
                    break;
                case '}':
                case ']':
                case '>':
                    if (!stack.isEmpty()) {
                        char ch = stack.pop().toString().toCharArray()[0];
                        if (c == '}' && ch != '{'
                                || c == ']' && ch != '['
                                || c == ')' && ch != '(') {
                            System.out.println("Error:" + ch + "-" + c);
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }

}
