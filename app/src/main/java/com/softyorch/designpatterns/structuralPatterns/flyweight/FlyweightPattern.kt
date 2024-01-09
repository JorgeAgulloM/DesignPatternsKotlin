package com.softyorch.designpatterns.structuralPatterns.flyweight

fun main() {
    val shapeFactory = ShapeFactory()

    val redCircle1 = shapeFactory.getCircle("Red")
    redCircle1.draw(100,100)

    val blueCircle1 = shapeFactory.getCircle("Blue")
    blueCircle1.draw(150,150)

    val redCircle2 = shapeFactory.getCircle("Red")
    redCircle2.draw(200,200)

    val blueCircle2 = shapeFactory.getCircle("Blue")
    blueCircle2.draw(250,250)

    shapeFactory.getCirclesCount()
}
