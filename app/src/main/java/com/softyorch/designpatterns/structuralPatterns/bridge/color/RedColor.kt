package com.softyorch.designpatterns.structuralPatterns.bridge.color

class RedColor : IColor {
    override fun applyColor(): String {
        return "rojo"
    }
}
