package com.softyorch.designpatterns.structuralPatterns.adapter

fun main() {
    val location = Location(37.7749, -122.419416)
    val mapService: IMapService = LocationAdapter(location, object : IMapService {
        override fun displayLocation(jsonData: String) {
            println("Datos de ubicación en formato JSON: $jsonData")
        }
    })

    (mapService as LocationAdapter).displayLocation()
}
