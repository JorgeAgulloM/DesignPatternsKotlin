package com.softyorch.designpatterns.behaviour.mediator

interface Mediator {
    fun sendMessage(message: String, colleague: Colleague)
}
