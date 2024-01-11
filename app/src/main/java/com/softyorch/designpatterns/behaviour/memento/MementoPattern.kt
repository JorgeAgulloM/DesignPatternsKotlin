package com.softyorch.designpatterns.behaviour.memento

fun main() {
    val originator = Originator("Estado1")
    val caretaker = Caretaker()
    caretaker.addMemento(originator.createMemento())
    println("Estado actual del originador: ${originator.state}")

    originator.state = "Estado2"
    caretaker.addMemento(originator.createMemento())
    println("Estado actual del originador: ${originator.state}")

    originator.restoreMemento(caretaker.getMemento(0)!!)
    println("Estado actual del originador: ${originator.state}")
}
