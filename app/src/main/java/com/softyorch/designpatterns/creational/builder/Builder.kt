package com.softyorch.designpatterns.creational.builder

interface Builder {
    fun setName(name: String)
    fun setAge(age: Int)
    fun setDescription(description: String)
    fun setPower(power: String)
    fun setWeakness(weakness: String)
    fun setIsAvenger(isAvenger: Boolean)
    fun setIsAlive(isAlive: Boolean)
    fun setIsVillain(isVillain: Boolean)
}