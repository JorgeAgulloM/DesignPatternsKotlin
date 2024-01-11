package com.softyorch.designpatterns.behaviour.mediator

class ConcreteColleagueB(mediator: Mediator) : Colleague(mediator) {
    override fun send(message: String) {
        mediator.sendMessage(message, this)
    }

    override fun receive(message: String) {
        println("ColegaB: He recivido el mensaje: $message")
    }
}
