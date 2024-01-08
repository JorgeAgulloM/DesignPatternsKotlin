package com.softyorch.designpatterns.structuralPatterns.decorator.decorators

import com.softyorch.designpatterns.structuralPatterns.decorator.Coffee

class MilkDecorator(decoratorCoffee: Coffee) : CoffeeDecorator(decoratorCoffee) {
    override fun cost(): Double {
        return super.cost() + 1.0
    }

    override fun description(): String {
        return super.description() + " con leche"
    }
}
