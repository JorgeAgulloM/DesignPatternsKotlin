package com.softyorch.designpatterns.creational

/**
 * *******************************************
 * Problem
 * *******************************************
 */

class Config() {
    var name: String = ""

    //method
    fun exampleMethod() {}
}

class Foo() {
    private val config = Config()

    fun example() {
        config.name = "Jorge"
        config.exampleMethod()
    }
}

class Poo() {

    fun example2() {
        val config = Config()
        print(config.name) // print -> ""
    }
}

/**
 * *******************************************
 * Solution
 * *******************************************
 */

// private constructor block new creations
class Config2 private constructor() {
    var name: String = ""

    companion object {
        val instance: Config2 by lazy { Config2() }
    }
}

/**
 * *******************************************
 * Solution two. Easier to use
 * *******************************************
 */

object Config3 {
    var name: String = ""
}


fun main() {
    val example1: Config2 = Config2.instance
    val example2: Config2 = Config2.instance

    example1.name = "Jorge"
    print(example2.name) // print -> "Jorge"

    print("\n")

    Config3.name = "Yorch"
    print(Config3.name) // print -> "Yorch"
}















