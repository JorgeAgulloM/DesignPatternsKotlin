package com.softyorch.designpatterns.behaviour.strategy

fun main() {
    val stringsToSort = listOf("Hola", "Strategy", "Patrón", "Kotlin", "Ordenamiento")

    val bubbleSorter = StringSorter(BubbleSortStrategy())
    val sortedByBubble = bubbleSorter.sortStrings(stringsToSort)
    println("Ordenado por Burbuja: $sortedByBubble")

    val lengthSorter = StringSorter(LengthSortStrategy())
    val sortedByLength = lengthSorter.sortStrings(stringsToSort)
    println("Ordenado por Longitud: $sortedByLength")
}
