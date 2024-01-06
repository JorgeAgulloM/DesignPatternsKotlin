package com.softyorch.designpatterns.structuralPatterns.bridge

import com.softyorch.designpatterns.structuralPatterns.bridge.color.RedColor
import com.softyorch.designpatterns.structuralPatterns.bridge.platform.DesktopPlatform
import com.softyorch.designpatterns.structuralPatterns.bridge.platform.MobilePlatform
import com.softyorch.designpatterns.structuralPatterns.bridge.shape.Circle
import com.softyorch.designpatterns.structuralPatterns.bridge.bridge.CirclePlatformBridge
import com.softyorch.designpatterns.structuralPatterns.bridge.bridge.SquarePlatformBridge
import com.softyorch.designpatterns.structuralPatterns.bridge.color.GreenColor
import com.softyorch.designpatterns.structuralPatterns.bridge.shape.Square

fun main() {
    val redCircleOnDesktop = CirclePlatformBridge(Circle(RedColor()), DesktopPlatform())
    println(redCircleOnDesktop.drawOnPlatformWithShape())

    val redSquareOnDesktop = SquarePlatformBridge(Square(RedColor()), DesktopPlatform())
    println(redSquareOnDesktop.drawOnPlatformWithShape())

    val redCircleOnMobile = CirclePlatformBridge(Circle(RedColor()), MobilePlatform())
    println(redCircleOnMobile.drawOnPlatformWithShape())

    val grinSquareOnMobile = SquarePlatformBridge(Square(GreenColor()), MobilePlatform())
    println(grinSquareOnMobile.drawOnPlatformWithShape())
}
