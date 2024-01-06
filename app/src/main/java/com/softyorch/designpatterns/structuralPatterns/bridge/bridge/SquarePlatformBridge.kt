package com.softyorch.designpatterns.structuralPatterns.bridge.bridge

import com.softyorch.designpatterns.structuralPatterns.bridge.platform.IPlatform
import com.softyorch.designpatterns.structuralPatterns.bridge.shape.Square

class SquarePlatformBridge(square: Square, platform: IPlatform) :
    AbstractShapePlatformBridge(square, platform) {
    override fun drawOnPlatformWithShape(): String {
        return "${shape.draw()} ${platform.drawOnPlatform()}"
    }
}
