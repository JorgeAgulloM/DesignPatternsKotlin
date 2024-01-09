package com.softyorch.designpatterns.structuralPatterns.proxy

class RealImage(private val filename: String) : Image {

    init {
        loadFromDisk()
    }

    private fun loadFromDisk() {
        println("Cargando imagen $filename")
    }

    override fun display() {
        println("Mostrando la imagen $filename")
    }
}
