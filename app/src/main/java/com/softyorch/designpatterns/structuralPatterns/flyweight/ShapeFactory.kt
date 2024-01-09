package com.softyorch.designpatterns.structuralPatterns.flyweight

class ShapeFactory {
    private val circleMap = mutableMapOf<String, Circle>()

    fun getCircle(color: String): Circle {
        return circleMap.computeIfAbsent(color) { Circle(it) }
    }

    fun getCirclesCount() {
        println("ShapeFactory contiene ${circleMap.count()} objetos")
    }
}
