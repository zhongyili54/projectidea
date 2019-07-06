package com.auigui;

import java.util.ArrayList;
import java.util.List;

public class Test {
/**
 * 年龄
 **/
private int age = 12;
    public static void main(String[] args) {
        //模板1 sout pstm soutp soutm soutv
        System.out.println("helloworld");
        int money = 23;
        System.out.println("money = " + money);
        System.out.println("args = [" + args + "]");
        System.out.println("Test.main");
        //模板2 prsf  private static final
        //模板3 ifn inn
        List<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        //模板4 fori iter itar
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
       /* for (String s : list) {
            
        }*/

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            System.out.println(arg);
            
        }

    }

}
