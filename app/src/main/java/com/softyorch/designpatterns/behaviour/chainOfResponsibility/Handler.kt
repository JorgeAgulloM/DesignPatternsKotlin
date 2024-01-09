package com.softyorch.designpatterns.behaviour.chainOfResponsibility

abstract class Handler {
    var successor: Handler? = null

    abstract fun handleRequest(request: Int)
}
