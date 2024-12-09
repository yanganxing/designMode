package com.alix.design.mode.singleton;

/**
 * @Author: Alix
 * @Description: TODO
 * @DateTime: 2024/12/9 10:41
 **/
public class Test {

    public static void main(String[] args) {
        Person instance = Singleton4.INSTANCE.getInstance();
        System.out.println(instance.toString());
        Person instance1 = Singleton4.INSTANCE.getInstance();
        System.out.println(instance1.toString());

    }
}
