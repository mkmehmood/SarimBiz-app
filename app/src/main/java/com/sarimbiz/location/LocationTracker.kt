package com.sarimbiz.location

import android.content.Context
import android.location.Location
import com.google.android.gms.location.FusedLocationProviderClient

class LocationTracker(private val context: Context) {

    private val fusedLocationClient: FusedLocationProviderClient = FusedLocationProviderClient(context)

    fun getCurrentLocation(callback: (Location?) -> Unit) {
        // TODO: Implement location tracking logic
        callback(null)
    }
}
