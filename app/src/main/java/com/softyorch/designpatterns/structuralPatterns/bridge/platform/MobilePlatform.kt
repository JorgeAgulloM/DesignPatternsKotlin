package com.softyorch.designpatterns.structuralPatterns.bridge.platform

class MobilePlatform : IPlatform {
    override fun drawOnPlatform(): String {
        return "en un dispositivo móbil"
    }
}
