package com.softyorch.designpatterns.behaviour.iterator

class ConcreteCollection<T>(private val elements: List<T>): IterableCollection<T> {
    override fun createIterator(): Iterator<T> {
        return ConcreteIterator(elements)
    }
}
