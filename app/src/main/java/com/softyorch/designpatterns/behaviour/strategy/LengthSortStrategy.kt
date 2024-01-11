package com.softyorch.designpatterns.behaviour.strategy

class LengthSortStrategy : SortingStrategy {
    override fun sort(list: List<String>): List<String> {
        return list.sortedBy { it.length }
    }
}
