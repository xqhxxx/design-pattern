package com.xxx.pattern.pa01_简单工厂;
import java.util.Scanner;

/**
 * @author: xqh
 * @date: 2023/3/7 20:22
 * 〈功能概述〉<br>
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入数字A：");
        double a=Double.parseDouble(sc.nextLine());
        System.out.println("输入运算符（+ - / *）：");
        String strOperate=sc.nextLine().trim();
        System.out.println("输入数字B：");
        double b=Double.parseDouble(sc.nextLine());

        Operation op = OperationFactory.creatOperation(strOperate);

        double result = op.getResult(a, b);

        System.out.println("结果是："+result);
    }

}

