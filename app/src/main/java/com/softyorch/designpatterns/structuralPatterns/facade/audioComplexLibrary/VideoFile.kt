package com.softyorch.designpatterns.structuralPatterns.facade.audioComplexLibrary

class VideoFile {
    private var name: String? = null
    private var codecType: String? = null

    fun getCodecType(): String? {
        return codecType
    }

    fun setName(name: String?) {
        this.name = name
    }
    fun getName(): String? {
        return name
    }
}
