package com.softyorch.designpatterns.behaviour.memento

class Caretaker {
    private val mementos = mutableListOf<Memento>()

    fun addMemento(memento: Memento) {
        mementos.add(memento)
    }

    fun getMemento(index: Int): Memento? {
        return if (index in mementos.indices)
            mementos[index]
        else
            null
    }
}
