package com.softyorch.designpatterns.behaviour.visitor

import com.softyorch.designpatterns.behaviour.visitor.shapes.Circle
import com.softyorch.designpatterns.behaviour.visitor.shapes.Square
import com.softyorch.designpatterns.behaviour.visitor.shapes.Triangle

interface ShapeVisitor {
    fun visitCircle(circle: Circle)
    fun visitSquare(square: Square)
    fun visitTriangle(triangle: Triangle)
}
