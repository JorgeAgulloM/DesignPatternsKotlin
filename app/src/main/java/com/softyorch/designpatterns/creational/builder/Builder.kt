package com.softyorch.designpatterns.creational.builder

interface Builder {
    fun setName(name: String): Builder
    fun setAge(age: Int): Builder
    fun setDescription(description: String): Builder
    fun setPower(power: String): Builder
    fun setWeakness(weakness: String): Builder
    fun setIsAvenger(isAvenger: Boolean): Builder
    fun setIsAlive(isAlive: Boolean): Builder
    fun setIsVillain(isVillain: Boolean): Builder
    fun build(): Hero
}