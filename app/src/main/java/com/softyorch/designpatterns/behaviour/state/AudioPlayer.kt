package com.softyorch.designpatterns.behaviour.state

import com.softyorch.designpatterns.behaviour.state.states.StopState

class AudioPlayer {
    private var state: State = StopState()

    fun setState(newState: State) {
        state = newState
    }

    fun play() {
        state.play()
    }

    fun pause() {
        state.pause()
    }

    fun stop() {
        state.stop()
    }
}
