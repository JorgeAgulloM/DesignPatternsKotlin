package com.softyorch.designpatterns.structuralPatterns.proxy

fun main() {
    val image1: Image = ProxyImage("Imagen1.jpg")
    val image2: Image = ProxyImage("Imagen2.jpg")

    image1.display()

    image1.display()

    image2.display()
}
