package com.softyorch.designpatterns.behaviour.iterator

interface IterableCollection<T> {
    fun createIterator(): Iterator<T>
}
