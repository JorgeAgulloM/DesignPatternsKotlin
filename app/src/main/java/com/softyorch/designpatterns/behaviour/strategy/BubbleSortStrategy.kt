package com.softyorch.designpatterns.behaviour.strategy

class BubbleSortStrategy : SortingStrategy {
    override fun sort(list: List<String>): List<String> {
        val mutableList = list.toMutableList()
        for (i in 0 until mutableList.size - 1) {
            for (j in 0 until mutableList.size - 1 - i) {
                if (mutableList[j] > mutableList[j + 1]) {
                    val temp = mutableList[j]
                    mutableList[j] = mutableList[j + 1]
                    mutableList[j + 1] = temp
                }
            }
        }
        return mutableList
    }
}
