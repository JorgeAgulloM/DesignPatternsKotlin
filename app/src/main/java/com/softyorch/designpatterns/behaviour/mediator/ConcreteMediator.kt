package com.softyorch.designpatterns.behaviour.mediator

class ConcreteMediator : Mediator {
    private lateinit var colleagueA: ConcreteColleagueA
    private lateinit var colleagueB: ConcreteColleagueB

    fun sendColleagueA(colleagueA: ConcreteColleagueA) {
        this.colleagueA = colleagueA
    }

    fun sendColleagueB(colleagueB: ConcreteColleagueB) {
        this.colleagueB = colleagueB
    }

    override fun sendMessage(message: String, colleague: Colleague) {
        when (colleague) {
            is ConcreteColleagueA -> colleagueB.receive(message)
            is ConcreteColleagueB -> colleagueA.receive(message)
        }
    }
}
