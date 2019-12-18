package com.main;

public class Main {

    public static void main(String[] args) {
        /**********传统的匿名实现接口的方法*************/
        //对MyInterface接口对象进行创建的方式
        MyInterface mi=new MyInterface() {
            @Override
            public String show() {
                return "hello";
            }
        };

        System.out.println(mi.show());
        /*********************************************/

        /****************使用lambda语法实现*******************/
        MyInterface ma=()->{
            return "hello world";
        };
        System.out.println(ma.show());
        /*****************************************************/

        /*************使用limbda调用带有参数的接口方法***********/
        DemoInterface df=(int x,int y)->{
            return x+y;
        };
        System.out.println(df.add(12,22));
        /*****************************************************/
    }
}
