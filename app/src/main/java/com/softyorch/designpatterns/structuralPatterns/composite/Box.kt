package com.softyorch.designpatterns.structuralPatterns.composite

import java.lang.StringBuilder

class Box(private val name: String) : IShippable {
    private val items = mutableListOf<IShippable>()

    fun addItem(item: IShippable) {
        items.add(item)
    }

    override fun calculateShippingCost(): Double {
        var totalCost = 10.0

        items.forEach { item ->
            totalCost += item.calculateShippingCost()
        }

        return totalCost
    }

    override fun calculatePriceCost(): Double {
        var totalCost = 0.0

        items.forEach { item ->
            totalCost += item.calculatePriceCost()
        }

        return totalCost
    }

    override fun toString(): String {
        val result = StringBuilder("Caja: $name\n")

        items.forEach { item ->
            result.append("- ").append(item.toString()).append("\n")
        }

        return result.toString()
    }
}
