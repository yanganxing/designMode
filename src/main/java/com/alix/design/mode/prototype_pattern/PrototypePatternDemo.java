package com.alix.design.mode.prototype_pattern;

/**
 * @Author: Alix
 * @Description: 原型模式通过复制一个已经存在的实例来返回新的实例,而不是新建实例。被复制的实例就是我们所称的“原型”，这个原型是可定制的。原型模式多用于创建复杂的或者耗时的实例，因为这种情况下，复制一个已经存在的实例使程序运行更高效；或者创建值相等，只是命名不一样的同类数据。
 * @DateTime: 2024/12/9 11:10
 **/
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());
        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());
    }
}
