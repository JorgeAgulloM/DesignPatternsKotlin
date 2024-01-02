package com.softyorch.designpatterns.creational.builder

class SuperHeroBuilder : Builder {
    private var name: String? = null
    private var age: Int? = null
    private var description: String? = null
    private var power: String? = null
    private var weakness: String? = null
    private var isAvenger: Boolean? = null
    private var isAlive: Boolean? = null
    private var isVillain: Boolean? = null


    override fun setName(name: String) { this.name = name }
    override fun setAge(age: Int) { this.age = age }
    override fun setDescription(description: String) { this.description = description }
    override fun setPower(power: String) { this.power = power }
    override fun setWeakness(weakness: String) { this.weakness = weakness }
    override fun setIsAvenger(isAvenger: Boolean) { this.isAvenger = isAvenger }
    override fun setIsAlive(isAlive: Boolean) { this.isAlive = isAlive }
    override fun setIsVillain(isVillain: Boolean) { this. isVillain = isVillain }
}
