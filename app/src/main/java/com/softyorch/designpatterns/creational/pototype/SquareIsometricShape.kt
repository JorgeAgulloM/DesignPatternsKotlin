package com.softyorch.designpatterns.creational.pototype

class SquareIsometricShape: Prototype {
    private val original: IsometricShapes = IsometricShapes(name = "Cuadrado Isométrico", sides = 4)
    override fun clone(): Prototype {
        return SquareIsometricShape()
    }

    override fun getIsometricShape(): IsometricShapes {
        return original.copy()
    }
}
