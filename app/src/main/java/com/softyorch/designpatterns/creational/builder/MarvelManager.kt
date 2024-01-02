package com.softyorch.designpatterns.creational.builder

class MarvelManager {

    fun createSuperYorchHero(superHeroBuilder: SuperHeroBuilder): Hero {
        return superHeroBuilder
            .setName("SuperYorch")
            .setAge(41)
            .setIsAlive(true)
            .setDescription("Cream")
            .setIsVillain(false)
            .setPower("Kotlin")
            .setWeakness("Flutter")
            .build()
    }

    fun createSuperYorchStrong(superHeroBuilder: SuperHeroBuilder): Hero {
        return superHeroBuilder
            .setName("SuperYorch")
            .setAge(24)
            .setDescription("The best Yorch")
            .setPower("Kotlin")
            .build()
    }

}

fun main() {
    val marvel = MarvelManager()
    val superHeroBuilder = SuperHeroBuilder()
    marvel.createSuperYorchHero(superHeroBuilder)
    marvel.createSuperYorchStrong(superHeroBuilder)
}
