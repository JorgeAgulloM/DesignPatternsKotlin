package com.softyorch.designpatterns.behaviour.chainOfResponsibility

class ConcreteHandler2 : Handler() {
    override fun handleRequest(request: Int) {
        if (request in 11..20)
            println("Handler 2 ha manejado la recepción: $request")
        else
            successor?.handleRequest(request)
    }
}
