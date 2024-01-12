package com.softyorch.designpatterns.behaviour.visitor

import com.softyorch.designpatterns.behaviour.visitor.shapes.Circle
import com.softyorch.designpatterns.behaviour.visitor.shapes.Square
import com.softyorch.designpatterns.behaviour.visitor.shapes.Triangle

class AreaCalculator: ShapeVisitor {
    var totalArea = 0.0
    override fun visitCircle(circle: Circle) {
        // Lógica específica para calcular el área de un círculo
        totalArea += 3.14 // Se asume un valor fijo para simplificar el ejemplo
    }

    override fun visitSquare(square: Square) {
        // Lógica específica para calcular el área de un cuadrado
        totalArea += 4.0 // Se asume un valor fijo para simplificar el ejemplo
    }

    override fun visitTriangle(triangle: Triangle) {
        // Lógica específica para calcular el área de un triángulo
        totalArea += 2.5 // Se asume un valor fijo para simplificar el ejemplo
    }
}
