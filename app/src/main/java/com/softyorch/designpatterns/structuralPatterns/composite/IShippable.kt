package com.softyorch.designpatterns.structuralPatterns.composite

interface IShippable {
    fun calculateShippingCost(): Double
    fun calculatePriceCost(): Double
}
