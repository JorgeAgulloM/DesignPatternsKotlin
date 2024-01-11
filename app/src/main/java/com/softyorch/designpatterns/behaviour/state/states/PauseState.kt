package com.softyorch.designpatterns.behaviour.state.states

import com.softyorch.designpatterns.behaviour.state.State

class PauseState : State {
    override fun play() {
        println("Reproduciendo música...")
    }

    override fun pause() {
        println("Reanudar la reproducción.")
    }

    override fun stop() {
        println("Deteniendo la reproducción.")
    }
}
