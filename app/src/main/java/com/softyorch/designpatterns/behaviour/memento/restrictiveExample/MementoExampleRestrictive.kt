package com.softyorch.designpatterns.behaviour.memento.restrictiveExample

fun main() {
    val originator = Originator("Estado1")
    val caretaker = Caretaker()
    caretaker.addMemento(originator.createMemento())
    println("Estado actual del originador: ${originator.getState()}")

    originator.setState("Estado2")
    caretaker.addMemento(originator.createMemento())
    println("Estado actual del originador: ${originator.getState()}")

    originator.restoreMemento(caretaker.getMemento(0)!!)
    println("Estado actual del originador: ${originator.getState()}")
}
