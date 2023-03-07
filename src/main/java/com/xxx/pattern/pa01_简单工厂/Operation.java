package com.xxx.pattern.pa01_简单工厂;

/**
 * @author: xqh
 * @date: 2023/3/7 20:13
 * 〈功能概述〉<br>
 * 运算类
 */
public abstract class Operation {
    public double getResult(double a, double b) {
        return 0d;
    }

}


/**
 * 加减乘除类
 */
class  Add extends Operation{
    @Override
    public double getResult(double a, double b) {
        return a+b;
    }
}
class  Sub extends Operation{
    @Override
    public double getResult(double a, double b) {
        return a-b;
    }
}class  Mul extends Operation{
    @Override
    public double getResult(double a, double b) {
        return a*b;
    }
}class  Div extends Operation{
    @Override
    public double getResult(double a, double b) {
        if (b==0){
            System.out.println("除数不能为0");
            throw new ArithmeticException();
        }
        return a/b;
    }
}


