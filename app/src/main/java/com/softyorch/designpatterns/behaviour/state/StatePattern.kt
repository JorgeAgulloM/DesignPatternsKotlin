package com.softyorch.designpatterns.behaviour.state

import com.softyorch.designpatterns.behaviour.state.states.PauseState
import com.softyorch.designpatterns.behaviour.state.states.PlayState
import com.softyorch.designpatterns.behaviour.state.states.StopState

fun main() {
    val audioPlayer = AudioPlayer()

    audioPlayer.play()

    audioPlayer.setState(PlayState())
    audioPlayer.play()

    audioPlayer.setState(PauseState())
    audioPlayer.pause()

    audioPlayer.setState(StopState())
    audioPlayer.stop()
}
