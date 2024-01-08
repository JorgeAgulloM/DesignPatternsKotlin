package com.softyorch.designpatterns.structuralPatterns.facade.audioComplexLibrary

class BitrateReader {
    fun read(file: VideoFile?, codec: Codec?): VideoFile? {
        println("BitrateReader: reading file...")
        return file
    }

    fun convert(buffer: VideoFile?, codec: Codec?): VideoFile? {
        println("BitrateReader: writing file...")
        return buffer
    }
}
