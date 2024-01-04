package com.softyorch.designpatterns.creational.pototype

class TriangleIsometricShape: IPrototype {
    private val original: IsometricShapes = IsometricShapes(name = "Triángulo Isométrico", sides = 3)
    override fun clone(): IPrototype {
        return TriangleIsometricShape()
    }

    override fun getIsometricShape(): IsometricShapes {
        return original.copy()
    }
}
