package com.softyorch.designpatterns.behaviour.visitor

interface Shape {
    fun accept(visitor: ShapeVisitor)
}
