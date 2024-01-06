package com.softyorch.designpatterns.structuralPatterns.composite

class Product(private val name: String, private val price: Double) : IShippable {
    override fun calculateShippingCost(): Double {
        return 5.0
    }

    override fun calculatePriceCost(): Double {
        return price
    }

    override fun toString(): String {
        return "$name (\$$price)"
    }
}
