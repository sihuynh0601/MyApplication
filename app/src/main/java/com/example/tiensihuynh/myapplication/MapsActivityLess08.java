package com.example.tiensihuynh.myapplication;


import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapsActivityLess08 extends FragmentActivity implements OnMapReadyCallback {
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_less08);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        // Add a marker in Silicon Vallley
        // 37.3876° N, 123.0575° W
        LatLng siliconValley = new LatLng(37.3876,238.0575);
        map.addMarker(new MarkerOptions().position(siliconValley).title("Silicon Valley"));
        map.moveCamera(CameraUpdateFactory.newLatLng(siliconValley));
    }
}
