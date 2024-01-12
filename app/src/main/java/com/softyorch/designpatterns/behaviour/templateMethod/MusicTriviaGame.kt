package com.softyorch.designpatterns.behaviour.templateMethod

class MusicTriviaGame : Game() {
    override fun initializeGame() {
        println("Inicializando el juego de trivia musical.")
    }

    override fun startGame() {
        println("Comienza la trivia musical. ¡Escucha la música y responde las preguntas!")
    }

    override fun playGame() {
        println("Pregunta 1: ¿Quién es el cantante de esta canción?")
        // Lógica para manejar la respuesta y avanzar al siguiente conjunto de preguntas
        // ...

        println("Pregunta 2: ¿Cuál es el título de esta canción famosa?")
        // Lógica para manejar la respuesta y avanzar al siguiente conjunto de preguntas
        // ...

        // Continúan más preguntas y lógica del juego
    }

    override fun endGame() {
        println("Fin de la trivia musical. ¡Esperamos que hayas acertado las preguntas!")
    }
}
