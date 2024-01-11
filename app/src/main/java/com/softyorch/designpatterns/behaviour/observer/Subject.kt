package com.softyorch.designpatterns.behaviour.observer

class Subject {
    private val observers = mutableListOf<Observer>()

    fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    fun notifyObservers(message: String) {
        for (observer in observers) {
            observer.update(message)
        }
    }
}
