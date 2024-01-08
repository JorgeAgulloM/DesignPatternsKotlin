package com.softyorch.designpatterns.structuralPatterns.facade

import com.softyorch.designpatterns.structuralPatterns.facade.audioComplexLibrary.AudioMixer
import com.softyorch.designpatterns.structuralPatterns.facade.audioComplexLibrary.BitrateReader
import com.softyorch.designpatterns.structuralPatterns.facade.audioComplexLibrary.Codec
import com.softyorch.designpatterns.structuralPatterns.facade.audioComplexLibrary.CodecFactory
import com.softyorch.designpatterns.structuralPatterns.facade.audioComplexLibrary.MPEG4CompressionCodec
import com.softyorch.designpatterns.structuralPatterns.facade.audioComplexLibrary.OggCompressionCodec
import com.softyorch.designpatterns.structuralPatterns.facade.audioComplexLibrary.VideoFile
import java.io.File


class VideoConversionFacade {
    fun convertVideo(fileName: String?, format: String): File? {
        println("VideoConversionFacade: conversion started.")
        val file = VideoFile()
        file.setName(fileName)

        val codecFactory = CodecFactory()
        val sourceCodec: Codec = codecFactory.extract(file)
        val destinationCodec: Codec = if (format == "mp4") {
            MPEG4CompressionCodec()
        } else {
            OggCompressionCodec()
        }
        val bitrateReader = BitrateReader()
        val buffer: VideoFile? = bitrateReader.read(file, sourceCodec)
        val intermediateResult: VideoFile? = bitrateReader.convert(buffer, destinationCodec)
        val result = AudioMixer().fix(intermediateResult)
        println("VideoConversionFacade: conversion completed.")
        return result
    }
}
