package com.softyorch.designpatterns.behaviour.command

class RemoteControl {
    private var command: Command? = null

    fun setCommand(command: Command) {
        this.command = command
    }

    fun pressButton() {
        command?.execute()
    }
}
