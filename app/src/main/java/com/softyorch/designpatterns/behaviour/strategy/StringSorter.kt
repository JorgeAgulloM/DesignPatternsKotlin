package com.softyorch.designpatterns.behaviour.strategy

class StringSorter(private val sortingStrategy: SortingStrategy) {
    fun sortStrings(strings: List<String>): List<String> {
        return sortingStrategy.sort(strings)
    }
}
