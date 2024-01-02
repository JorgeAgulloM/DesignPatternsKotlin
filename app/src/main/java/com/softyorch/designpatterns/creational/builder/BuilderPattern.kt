package com.softyorch.designpatterns.creational.builder

/**
 * *******************************************
 * Problem
 * *******************************************
 */

data class Hero(
    val name: String?,
    val age: Int?,
    val description: String?,
    val power: String?,
    val weakness: String?,
    val isAvenger: Boolean?,
    val isAlive: Boolean?,
    val isVillain: Boolean?,
)


fun example() {
    val nerdHero = Hero("SuperYorch", null, null, null, "FLUTTER", null, null, null)
}

/**
 * *******************************************
 * Solution
 * *******************************************
 */





