package com.softyorch.designpatterns.behaviour.state.states

import com.softyorch.designpatterns.behaviour.state.State

class StopState : State {
    override fun play() {
        println("Iniciar reproducción.")
    }

    override fun pause() {
        println("No se puede pausar, no se está reproduciendo nada.")
    }

    override fun stop() {
        println("Ya se ha detenido la reproducción...")
    }
}
