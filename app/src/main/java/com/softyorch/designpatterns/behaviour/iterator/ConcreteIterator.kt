package com.softyorch.designpatterns.behaviour.iterator

class ConcreteIterator<T>(private val elements: List<T>) : Iterator<T> {
    private var index = 0
    override fun hasNext(): Boolean {
        return index < elements.size
    }

    override fun next(): T {
        return if (hasNext()) {
            val element = elements[index]
            index++
            element
        } else {
            throw NoSuchElementException()
        }
    }
}
