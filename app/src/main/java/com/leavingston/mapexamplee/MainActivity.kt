package com.leavingston.mapexamplee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment

class MainActivity : AppCompatActivity() , OnMapReadyCallback {

   private lateinit var googleMap : GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = supportFragmentManager.findFragmentById(R.id.map_fragment) as SupportMapFragment
        fragment.getMapAsync(this)
    }

    override fun onMapReady(p0: GoogleMap) {

        this.googleMap = p0

    }
}