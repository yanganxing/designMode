package com.alix.design.mode.singleton;

/**
 * @Author: Alix
 * @Description: 双重检测锁实现单例模式
 * @DateTime: 2024/12/9 10:23
 **/
public class Singleton2 {

    private volatile Singleton2 instance = null;

    private Singleton2() {
    }

    /**
     * 双重检查保证线程安全 按需创建
     */
    public Singleton2 getInstance() {
        if (null == instance) {
            synchronized (this) {
                if (null == instance) {
                    instance = new Singleton2();
                }
                return instance;
            }
        }
        return instance;
    }
}


