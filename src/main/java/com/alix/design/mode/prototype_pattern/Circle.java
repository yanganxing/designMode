package com.alix.design.mode.prototype_pattern;

/**
 * @Author: Alix
 * @Description: TODO
 * @DateTime: 2024/12/9 11:08
 **/
public class Circle extends Shape{

    public Circle() {
        type = "Circle";
    }
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
