package com.softyorch.designpatterns.structuralPatterns.adapter

class LocationAdapter(
    private val location: Location,
    private val mapService: IMapService
): IMapService {
    override fun displayLocation(jsonData: String) {
        println("Mostrando ubicación en el mapa: $jsonData")
    }

    private fun locationToJson(): String {
        return "{\"latitude\": ${location.latitude}, \"longitude\": ${location.longitude}}"
    }

    fun displayLocation() {
        val jsonData = locationToJson()
        mapService.displayLocation(jsonData)
    }
}
