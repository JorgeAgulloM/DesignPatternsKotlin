package com.softyorch.designpatterns.structuralPatterns.bridge.shape

import com.softyorch.designpatterns.structuralPatterns.bridge.color.IColor

class Circle(private var color: IColor) : IShape {
    override fun draw(): String {
        return "Dibujando un circulo de color ${color.applyColor()}"
    }
}
