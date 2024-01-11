package com.softyorch.designpatterns.behaviour.mediator

fun main() {
    val mediator = ConcreteMediator()

    val colleagueA = ConcreteColleagueA(mediator)
    val colleagueB = ConcreteColleagueB(mediator)

    mediator.sendColleagueA(colleagueA)
    mediator.sendColleagueB(colleagueB)

    colleagueA.send("Hola desde ColegaA!")
    colleagueB.send("Que tal desde ColegaB!")
}
