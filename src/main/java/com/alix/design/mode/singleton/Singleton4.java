package com.alix.design.mode.singleton;

/**
 * @Author: Alix
 * @Description: 通过枚举类实现 可以防止反射攻击
 * @DateTime: 2024/12/9 10:36
 **/
public enum Singleton4 {
    INSTANCE;

    private Person instance;

    Singleton4() {
        instance = new Person();
    }

    public Person getInstance() {
        return instance;
    }
}
