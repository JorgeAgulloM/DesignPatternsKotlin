package com.softyorch.designpatterns.behaviour.state.states

import com.softyorch.designpatterns.behaviour.state.State

class PlayState : State {
    override fun play() {
        println("Ya está reproduciendo música...")
    }

    override fun pause() {
        println("Pausando la reproducción.")
    }

    override fun stop() {
        println("Deteniendo la reproducción.")
    }
}
