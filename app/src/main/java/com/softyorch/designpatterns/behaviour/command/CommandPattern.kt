package com.softyorch.designpatterns.behaviour.command

fun main() {
    val light = Light()

    val lightOnCommand = LightOnCommand(light)
    val lightOffCommand = LightOffCommand(light)

    val remote = RemoteControl()

    remote.setCommand(lightOnCommand)
    remote.pressButton()

    remote.setCommand(lightOffCommand)
    remote.pressButton()
}
