package com.alix.design.mode.prototype_pattern;

/**
 * @Author: Alix
 * @Description: TODO
 * @DateTime: 2024/12/9 11:09
 **/
public class Square extends Shape{

    public Square() {
        type = "Square";
    }
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
