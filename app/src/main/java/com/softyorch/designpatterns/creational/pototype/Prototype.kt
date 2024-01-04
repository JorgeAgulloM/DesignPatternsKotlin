package com.softyorch.designpatterns.creational.pototype

interface Prototype {
    fun clone(): Prototype
    fun getIsometricShape(): IsometricShapes
}