package com.softyorch.designpatterns.structuralPatterns.bridge.bridge

import com.softyorch.designpatterns.structuralPatterns.bridge.platform.IPlatform
import com.softyorch.designpatterns.structuralPatterns.bridge.shape.IShape

abstract class AbstractShapePlatformBridge(protected val shape: IShape, protected val platform: IPlatform) {
    abstract fun drawOnPlatformWithShape(): String
}
