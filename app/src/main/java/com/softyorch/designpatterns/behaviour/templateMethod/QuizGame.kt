package com.softyorch.designpatterns.behaviour.templateMethod

class QuizGame : Game() {
    override fun initializeGame() {
        println("Inicializando el juego de preguntas y respuestas.")
    }

    override fun startGame() {
        println("Comienza el juego. Prepárate para responder las preguntas.")
    }

    override fun playGame() {
        println("Pregunta 1: ¿Cuál es la capital de Francia?")
        // Lógica para manejar la respuesta y avanzar al siguiente conjunto de preguntas
        // ...

        println("Pregunta 2: ¿En qué año se fundó Google?")
        // Lógica para manejar la respuesta y avanzar al siguiente conjunto de preguntas
        // ...

        // Continúan más preguntas y lógica del juego
    }

    override fun endGame() {
        println("Fin del juego. ¡Esperamos que hayas disfrutado!")
    }
}
