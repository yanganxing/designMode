package com.alix.design.mode.prototype_pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Alix
 * @Description: TODO
 * @DateTime: 2024/12/9 11:09
 **/
public class ShapeCache {
    private static Map<String, Shape> shapeMap = new HashMap<>();
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }
    // For each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding three shapes
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);
        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);
    }
}
