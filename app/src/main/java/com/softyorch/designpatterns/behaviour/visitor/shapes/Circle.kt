package com.softyorch.designpatterns.behaviour.visitor.shapes

import com.softyorch.designpatterns.behaviour.visitor.Shape
import com.softyorch.designpatterns.behaviour.visitor.ShapeVisitor

class Circle : Shape {
    override fun accept(visitor: ShapeVisitor) {
        visitor.visitCircle(this)
    }
}
