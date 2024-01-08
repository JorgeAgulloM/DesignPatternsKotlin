package com.softyorch.designpatterns.structuralPatterns.facade


fun main() {
    val converter = VideoConversionFacade()
    converter.convertVideo("youtubevideo.ogg", "mp4")
}
