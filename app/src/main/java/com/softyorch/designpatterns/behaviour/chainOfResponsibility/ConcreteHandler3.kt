package com.softyorch.designpatterns.behaviour.chainOfResponsibility

class ConcreteHandler3 : Handler() {
    override fun handleRequest(request: Int) {
        if (request > 20)
            println("Handler 3 ha manejado la recepción: $request")
        else
            successor?.handleRequest(request)
    }
}
