package com.alix.design.mode.singleton;

/**
 * @Author: Alix
 * @Description: 单例模式 饿汉式
 * @DateTime: 2024/12/4 09:59
 **/
public class Singleton1 {

    private Singleton1() {
    }

    private static Singleton1 instance = new Singleton1();

    /**
     * 最简单的单例模式实现，类加载的时候就创建了实例
     * 容易产生垃圾对象 浪费内存
     */
    public static Singleton1 getInstance() {
        return instance;
    }


}
