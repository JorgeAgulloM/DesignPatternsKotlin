package com.softyorch.designpatterns.behaviour.iterator

interface Iterator<T> {
    fun hasNext(): Boolean
    fun next(): T
}
