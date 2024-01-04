package com.softyorch.designpatterns.creational.pototype

class TriangleIsometricShape: Prototype {
    private val original: IsometricShapes = IsometricShapes(name = "Triángulo Isométrico", sides = 3)
    override fun clone(): Prototype {
        return TriangleIsometricShape()
    }

    override fun getIsometricShape(): IsometricShapes {
        return original.copy()
    }
}
