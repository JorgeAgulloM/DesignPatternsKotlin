package com.softyorch.designpatterns.creational.pototype

interface IPrototype {
    fun clone(): IPrototype
    fun getIsometricShape(): IsometricShapes
}