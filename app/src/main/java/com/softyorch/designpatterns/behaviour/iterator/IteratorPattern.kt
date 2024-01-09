package com.softyorch.designpatterns.behaviour.iterator

fun main() {
    val collection = ConcreteCollection(listOf("A", "B", "C", "D", "E"))
    val iterator = collection.createIterator()

    while (iterator.hasNext()) {
        val element = iterator.next()
        println("Elemento $element")
    }
}
