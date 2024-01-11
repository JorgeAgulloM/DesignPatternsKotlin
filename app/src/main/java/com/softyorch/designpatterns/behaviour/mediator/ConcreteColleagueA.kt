package com.softyorch.designpatterns.behaviour.mediator

class ConcreteColleagueA(mediator: Mediator) : Colleague(mediator) {
    override fun send(message: String) {
        mediator.sendMessage(message, this)
    }

    override fun receive(message: String) {
        println("ColegaA: He recivido el mensaje: $message")
    }
}
