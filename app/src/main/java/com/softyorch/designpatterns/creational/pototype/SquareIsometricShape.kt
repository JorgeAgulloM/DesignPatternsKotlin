package com.softyorch.designpatterns.creational.pototype

class SquareIsometricShape: IPrototype {
    private val original: IsometricShapes = IsometricShapes(name = "Cuadrado Isométrico", sides = 4)
    override fun clone(): IPrototype {
        return SquareIsometricShape()
    }

    override fun getIsometricShape(): IsometricShapes {
        return original.copy()
    }
}
