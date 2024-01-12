package com.softyorch.designpatterns.behaviour.visitor

import com.softyorch.designpatterns.behaviour.visitor.shapes.Circle
import com.softyorch.designpatterns.behaviour.visitor.shapes.Square
import com.softyorch.designpatterns.behaviour.visitor.shapes.Triangle

fun main() {
    val shapes: List<Shape> = listOf(Circle(), Square(), Triangle())

    val areaCalculator = AreaCalculator()

    shapes.forEach { shape ->
        shape.accept(areaCalculator)
    }

    println("El área total de las formas es ${areaCalculator.totalArea}")
}
