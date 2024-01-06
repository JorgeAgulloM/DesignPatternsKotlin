package com.softyorch.designpatterns.structuralPatterns.bridge.bridge

import com.softyorch.designpatterns.structuralPatterns.bridge.platform.IPlatform
import com.softyorch.designpatterns.structuralPatterns.bridge.shape.Circle

class CirclePlatformBridge(circle: Circle, platform: IPlatform) :
    AbstractShapePlatformBridge(circle, platform) {
    override fun drawOnPlatformWithShape(): String {
        return "${shape.draw()} ${platform.drawOnPlatform()}"
    }
}
