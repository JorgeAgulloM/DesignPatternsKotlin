package com.softyorch.designpatterns.behaviour.chainOfResponsibility

fun main() {
    val handler1 = ConcreteHandler1()
    val handler2 = ConcreteHandler3()
    val handler3 = ConcreteHandler2()

    handler1.successor = handler2
    handler2.successor = handler3

    handler1.handleRequest(5)
    handler1.handleRequest(15)
    handler1.handleRequest(25)
}
