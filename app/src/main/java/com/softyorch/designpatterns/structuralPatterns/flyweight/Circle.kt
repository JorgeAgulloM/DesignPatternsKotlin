package com.softyorch.designpatterns.structuralPatterns.flyweight

class Circle(private val color: String) : Shape {
    override fun draw(x: Int, y: Int) {
        println("Pintando un círculo de color $color de ($x, $y)")
    }
}
