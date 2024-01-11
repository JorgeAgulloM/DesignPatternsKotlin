package com.softyorch.designpatterns.behaviour.strategy

interface SortingStrategy {
    fun sort(list: List<String>): List<String>
}
