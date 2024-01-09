package com.softyorch.designpatterns.behaviour.command

class LightOnCommand(private val light: Light) : Command {
    override fun execute() {
        light.turnOn()
    }
}
