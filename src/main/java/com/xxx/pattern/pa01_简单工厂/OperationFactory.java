package com.xxx.pattern.pa01_简单工厂;

/**
 * @author: xqh
 * @date: 2023/3/6 21:53
 * 〈功能概述〉<br>
 * 简单工厂类
 */
public class OperationFactory {

    public static Operation creatOperation(String operate) {
        Operation op = null;
//        根据运算符  实例化出合适的对象
//        通过多态 返回父类
        switch (operate) {
            case "+":
                op = new Add();
                break;
            case "-":
                op = new Sub();
                break;
            case "*":
                op = new Mul();
                break;
            case "/":
                op = new Div();
                break;
        }
        return op;

    }
}
