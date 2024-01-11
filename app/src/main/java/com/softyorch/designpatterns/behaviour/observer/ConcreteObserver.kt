package com.softyorch.designpatterns.behaviour.observer

class ConcreteObserver(private val name: String) : Observer {
    override fun update(message: String) {
        println("$name mensaje revicido: $message")
    }
}
