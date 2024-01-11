package com.softyorch.designpatterns.behaviour.memento.restrictiveExample

class Originator(private var state: String) {
    fun createMemento(): Memento {
        return object : Memento {
            override fun getState(): String = state
        }
    }

    fun restoreMemento(memento: Memento) {
        state = memento.getState()
    }

    fun getState(): String = state

    fun setState(newState: String) {
        state = newState
    }
}
