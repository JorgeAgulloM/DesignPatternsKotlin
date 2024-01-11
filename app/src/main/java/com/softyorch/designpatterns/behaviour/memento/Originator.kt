package com.softyorch.designpatterns.behaviour.memento

class Originator(var state: String) {
    fun createMemento(): Memento {
        return Memento(state)
    }

    fun restoreMemento(memento: Memento) {
        state = memento.state
    }
}
