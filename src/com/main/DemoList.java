package com.main;
import java.util.*;
public class DemoList {
    public static void main(String[] args) {
        List<Integer> ls=Arrays.asList(12,33,45,6,78,45,67,32);
        /***********原始的访问集合中元素的方法**********/
        for (Integer n:ls) {
            System.out.println(n);
        }
        /********************************************/
        System.out.println("=========stream方式访问集合元素=============");
        /**********是用Stream方式对集合中的数据进行访问********/
        ls.stream()
                .filter(x->x>30)//过滤掉元素值小于等于30的所有数据并输出显示
                .forEach(x->{
            System.out.println(x);
        });
        /***************************************************/
        /********************************************/
        System.out.println("=========stream方式访问集合元素并排序输出=============");
        /**********是用Stream方式对集合中的数据进行访问********/
        ls.stream()
                .sorted((o1,o2)->{return o2-o1;})//降序
                .forEach(x->{
                    System.out.println(x);
                });
        /***************************************************/
    }
}
