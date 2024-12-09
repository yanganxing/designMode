package com.alix.design.mode.singleton;

/**
 * @Author: Alix
 * @Description: 静态内部类实现单例模式
 * @DateTime: 2024/12/9 10:29
 **/
public class Singleton3 {

    private Singleton3() {
    }

    private static class SingletonHolder {
        private static final Singleton3 INSTANCE = new Singleton3();
    }

    /**
     * 使用静态内部类来实现懒汉式单例模式，保证线程安全和性能。这种方式能达到双检锁方式一样的功效，但实现更简单。
     */
    public static Singleton3 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
