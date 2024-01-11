package com.softyorch.designpatterns.behaviour.observer

fun main() {
    val subject = Subject()

    val observer1 = ConcreteObserver("Observer 1")
    val observer2 = ConcreteObserver("Observer 2")

    subject.addObserver(observer1)
    subject.addObserver(observer2)

    subject.notifyObservers("Hola observadores!!")

    subject.removeObserver(observer1)

    subject.notifyObservers("Observadores actualizados")
}
