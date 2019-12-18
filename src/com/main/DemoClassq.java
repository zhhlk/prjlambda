package com.main;

public class DemoClassq {
    public void callDemo(DemoInterface df,int x){
        System.out.println(df.add(12,33)+x);
    }
    public static void main(String[] args) {
        //将limbda表达式作为参数进行传递
        DemoClassq dc=new DemoClassq();
        dc.callDemo((x,y)->{return x+y;},12);
        //上例中代码不便于阅读,可以修改为下面的语法描述
        DemoInterface df=(x,y)->{
            return x+y;
        };
        dc.callDemo(df,22);
    }
}
