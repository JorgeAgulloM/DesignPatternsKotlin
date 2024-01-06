package com.softyorch.designpatterns.structuralPatterns.composite

fun main() {
    val laptop = Product("Portatil", 1200.0)
    val book = Product("Libro", 20.0)

    val box1 = Box("Caja grande")
    box1.addItem(laptop)
    box1.addItem(book)

    val headPhones = Product("Auriculares", 50.0)
    val box2 = Box("Caja pequeña")
    box2.addItem(headPhones)

    box1.addItem(box2)

    val shippingCost = box1.calculateShippingCost()
    println("Coste total de envío: \$$shippingCost")

    println("Contenido del envío: \n$box1")

    val totalPrice = box1.calculatePriceCost()
    println("Precio total de los productos: \$$totalPrice")
}
