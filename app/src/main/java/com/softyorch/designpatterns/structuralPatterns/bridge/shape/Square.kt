package com.softyorch.designpatterns.structuralPatterns.bridge.shape

import com.softyorch.designpatterns.structuralPatterns.bridge.color.IColor

class Square(private var color: IColor): IShape {
    override fun draw(): String {
        return "Dibujando un cuadrado de color ${color.applyColor()}"
    }
}
