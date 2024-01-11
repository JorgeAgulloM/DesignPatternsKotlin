package com.softyorch.designpatterns.behaviour.memento.restrictiveExample

class Caretaker {
    private val mementos = mutableListOf<Memento>()

    fun addMemento(memento: Memento) {
        mementos.add(memento)
    }

    fun getMemento(index: Int): Memento? {
        return mementos.getOrNull(index)
    }
}
