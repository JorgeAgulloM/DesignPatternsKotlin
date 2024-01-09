package com.softyorch.designpatterns.behaviour.chainOfResponsibility

class ConcreteHandler1 : Handler() {
    override fun handleRequest(request: Int) {
        if (request <= 10)
            println("Handler 1 ha manejado la recepción: $request")
        else
            successor?.handleRequest(request)
    }
}
