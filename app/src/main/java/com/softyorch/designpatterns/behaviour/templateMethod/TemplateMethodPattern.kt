package com.softyorch.designpatterns.behaviour.templateMethod

fun main() {
    val quizGame = QuizGame()
    val musicTriviaGame = MusicTriviaGame()

    println("Jugando al juego d epreguntas y respuestas:")
    quizGame.play()

    println("\nJugando al trivia musical:")
    musicTriviaGame.play()
}
