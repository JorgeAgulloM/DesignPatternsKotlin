package com.softyorch.designpatterns.behaviour.command

class LightOffCommand(private val light: Light) : Command {
    override fun execute() {
        light.turnOff()
    }
}
