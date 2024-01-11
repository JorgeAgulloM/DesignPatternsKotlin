package com.softyorch.designpatterns.behaviour.mediator

abstract class Colleague(val mediator: Mediator) {
    abstract fun send(message: String)
    abstract fun receive(message: String)
}
