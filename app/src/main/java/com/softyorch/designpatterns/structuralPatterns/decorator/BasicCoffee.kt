package com.softyorch.designpatterns.structuralPatterns.decorator

class BasicCoffee : Coffee {
    override fun cost(): Double {
        return 3.0
    }

    override fun description(): String {
        return "Café básico"
    }
}