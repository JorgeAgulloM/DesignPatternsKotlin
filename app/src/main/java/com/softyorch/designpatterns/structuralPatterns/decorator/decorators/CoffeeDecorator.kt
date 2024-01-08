package com.softyorch.designpatterns.structuralPatterns.decorator.decorators

import com.softyorch.designpatterns.structuralPatterns.decorator.Coffee

abstract class CoffeeDecorator(private val decoratedCoffee: Coffee) : Coffee {
    override fun cost(): Double {
        return decoratedCoffee.cost()
    }

    override fun description(): String {
        return decoratedCoffee.description()
    }
}
