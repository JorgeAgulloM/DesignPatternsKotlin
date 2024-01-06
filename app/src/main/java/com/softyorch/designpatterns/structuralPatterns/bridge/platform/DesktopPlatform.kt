package com.softyorch.designpatterns.structuralPatterns.bridge.platform

class DesktopPlatform : IPlatform {
    override fun drawOnPlatform(): String {
        return "en una plicación de escritorio"
    }
}
