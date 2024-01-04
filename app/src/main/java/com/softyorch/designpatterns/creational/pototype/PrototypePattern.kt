package com.softyorch.designpatterns.creational.pototype

fun main() {
    val originalTriangle: IPrototype = TriangleIsometricShape()
    val cloneTriangle: IPrototype = originalTriangle.clone()

    val originalSquare: IPrototype = SquareIsometricShape()
    val cloneSquare: IPrototype = originalSquare.clone()

    val clonedTriangleIsometric: IsometricShapes = cloneTriangle.getIsometricShape()
    println("Original: ${originalTriangle.getIsometricShape()}, Lados: ${originalTriangle.getIsometricShape().sides}")
    println("Clonado: $clonedTriangleIsometric, Lados: ${clonedTriangleIsometric.sides}")

    val clonedSquareIsometric: IsometricShapes = cloneSquare.getIsometricShape()
    println("Original: ${originalSquare.getIsometricShape()}, Lados: ${originalSquare.getIsometricShape().sides}")
    println("Clonado: $clonedSquareIsometric, Lados: ${clonedSquareIsometric.sides}")

    /**
     * Original: IsometricShapes(name=Triángulo Isométrico, sides=3), Lados: 3
     * Clonado: IsometricShapes(name=Triángulo Isométrico, sides=3), Lados: 3
     * Original: IsometricShapes(name=Cuadrado Isométrico, sides=4), Lados: 4
     * Clonado: IsometricShapes(name=Cuadrado Isométrico, sides=4), Lados: 4
     */
}
