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


    override fun setName(name: String): SuperHeroBuilder {
        this.name = name
        return this
    }
    override fun setAge(age: Int): SuperHeroBuilder {
        this.age = age
        return this
    }
    override fun setDescription(description: String): SuperHeroBuilder {
        this.description = description
        return this
    }
    override fun setPower(power: String): SuperHeroBuilder {
        this.power = power
        return this
    }
    override fun setWeakness(weakness: String): SuperHeroBuilder {
        this.weakness = weakness
        return this
    }
    override fun setIsAvenger(isAvenger: Boolean): SuperHeroBuilder {
        this.isAvenger = isAvenger
        return this
    }
    override fun setIsAlive(isAlive: Boolean): SuperHeroBuilder {
        this.isAlive = isAlive
        return this
    }
    override fun setIsVillain(isVillain: Boolean): SuperHeroBuilder {
        this. isVillain = isVillain
        return this
    }
    override fun build(): Hero {
        return Hero(name, age, description, power, weakness, isAvenger, isAlive, isVillain)
    }
}
