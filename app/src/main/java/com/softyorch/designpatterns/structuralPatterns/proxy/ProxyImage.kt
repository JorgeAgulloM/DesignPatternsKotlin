package com.softyorch.designpatterns.structuralPatterns.proxy

class ProxyImage(private val filename: String) : Image {
    private var realImage: RealImage? = null
    override fun display() {
        if (realImage == null)
            realImage = RealImage(filename)
        realImage?.display()
    }
}
