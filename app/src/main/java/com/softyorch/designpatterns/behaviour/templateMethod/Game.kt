package com.softyorch.designpatterns.behaviour.templateMethod

abstract class Game {
    fun play() {
        initializeGame()
        startGame()
        playGame()
        endGame()
    }

    abstract fun initializeGame()
    abstract fun startGame()
    abstract fun playGame()
    abstract fun endGame()
}
