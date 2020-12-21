package com.example.appdatthucan;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng cf2 = new LatLng(16.0697527, 108.2151522);
        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(16.0680418, 108.2094249);
        LatLng q1 = new LatLng(16.066612540563327, 108.20787235607065);
        LatLng q2 = new LatLng(16.05841861834787, 108.21751745340093);
        LatLng q3= new LatLng(16.078033872617276, 108.21461222631419);
        LatLng q4= new LatLng(16.053125887964338, 108.21764635329423);
        LatLng q5= new LatLng(16.06737119760364, 108.2206121257333);
        LatLng q6= new LatLng(16.061358866958592, 108.22116465674411);
        LatLng q7= new LatLng(16.061416609962496, 108.22149980911124);
        LatLng q8= new LatLng(16.065874804877872, 108.21940516683522);

        mMap.addMarker(new MarkerOptions().position(sydney).title("The coffee house"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cf2, 15));
        mMap.addMarker(new MarkerOptions().title("The Coffee House").snippet("435 Lê Duẫn, Quận Thanh Khê").position(cf2));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(q1, 15));
        mMap.addMarker(new MarkerOptions().title("Bánh xèo Tôm nhảy Năm Hiền").snippet("46 Phan Thanh, Thanh Khê, Đà Nẵng").position(q1));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(q2, 15));
        mMap.addMarker(new MarkerOptions().title("Bánh Xèo Bà Dưỡng").snippet("280/23 Hoàng Diệu, Hải Châu, Đà Nẵng").position(q2));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(q3, 15));
        mMap.addMarker(new MarkerOptions().title(" Bún đậu Cuội Quán").snippet("166 Lý Tự Trọng, Hải Châu, Đà Nẵng.").position(q3));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(q4, 15));
        mMap.addMarker(new MarkerOptions().title(" Quán Trà Sữa - Ăn Vặt Sóc Nâu").snippet("467 Hoàng Diệu, Bình Thuận, Hải Châu, Đà Nẵng ").position(q4));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(q5, 15));
        mMap.addMarker(new MarkerOptions().title("Toco Toco ").snippet("72 Trần Quốc Toản, Hải Châu, Đà Nẵng").position(q5));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(q6, 15));
        mMap.addMarker(new MarkerOptions().title(" Trà sữa Gong Cha").snippet("25/29 Nguyễn Văn Linh, Hải Châu, Đà Nẵng").position(q6));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(q7, 15));
        mMap.addMarker(new MarkerOptions().title("Trà Tiên Hưởng Đà Nẵng ").snippet(" 32 Lê Đình Dương – Quận Hải Châu, Đà Nẵng").position(q7));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(q8, 15));
        mMap.addMarker(new MarkerOptions().title("Uncle Tea – Trà sữa Đài Loan ").snippet("30 -32 Hoàng Diệu, quận Hải Châu, Đà Nẵng").position(q8));
    }
}