package com.itu.isteus_v007;

import org.osmdroid.views.MapController;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.ScaleBarOverlay;
import org.osmdroid.views.overlay.SimpleLocationOverlay;

import android.app.Activity;
import android.os.Bundle;

public class Izle extends Activity {
	    private MapView mapView;
		private MapController mapController;
		private ScaleBarOverlay mScaleBarOverlay;
		private SimpleLocationOverlay mMyLocationOverlay;

	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.izle);
	        mapView = (MapView) this.findViewById(R.id.mapview);
	        mapView.setBuiltInZoomControls(true);
	        mapView.setMultiTouchControls(true);
	        mapController = this.mapView.getController();
	        mapController.setZoom(2);
	    }
	}