package com.softyorch.designpatterns.structuralPatterns.decorator.decorators

import com.softyorch.designpatterns.structuralPatterns.decorator.Coffee

class SugarDecorator(decoratorCoffee: Coffee) : CoffeeDecorator(decoratorCoffee) {
    override fun cost(): Double {
        return super.cost() + 0.5
    }

    override fun description(): String {
        return super.description() + " con azúcar"
    }
}
