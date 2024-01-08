package com.softyorch.designpatterns.structuralPatterns.decorator

import com.softyorch.designpatterns.structuralPatterns.decorator.decorators.MilkDecorator
import com.softyorch.designpatterns.structuralPatterns.decorator.decorators.SugarDecorator

fun main() {
    val basicCoffee: Coffee = BasicCoffee()

    val coffeeWithMilk: Coffee = MilkDecorator(basicCoffee)

    val coffeeWithSugar: Coffee = SugarDecorator(basicCoffee)

    val coffeeWithMilkAndSugar: Coffee = SugarDecorator(coffeeWithMilk)

    println("${basicCoffee.description()}, Costo: \$${basicCoffee.cost()}")
    println("${coffeeWithMilk.description()}, Costo: \$${coffeeWithMilk.cost()}")
    println("${coffeeWithSugar.description()}, Costo: \$${coffeeWithSugar.cost()}")
    println("${coffeeWithMilkAndSugar.description()}, Costo: \$${coffeeWithMilkAndSugar.cost()}")
}
