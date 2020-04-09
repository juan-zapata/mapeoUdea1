package medellin.mapa.google

import android.content.pm.PackageManager
import android.location.Location
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.core.app.ActivityCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions


class MapsActivity1() : AppCompatActivity(), OnMapReadyCallback,GoogleMap.OnMarkerClickListener{

    private lateinit var fusedLocationClient: FusedLocationProviderClient

    private lateinit var lastLocation: Location

    companion object {
        private const val LOCATION_PERMISSION_REQUEST_CODE = 1
    }

    override fun onMarkerClick(p0: Marker?) = false

    private lateinit var mMap: GoogleMap




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps1)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
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
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        mMap.uiSettings.isZoomControlsEnabled = true

        setUpMap()




        // ciudad universitaria
        val medellin = LatLng(6.2690559, -75.5695834)
        mMap.addMarker(MarkerOptions().position(medellin).title("sede ciudad universitaria").icon(BitmapDescriptorFactory.fromResource(R.drawable.university)))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(medellin, 9F))

        // sede robledo
        val robledo = LatLng(6.2709164, -75.5874797)
        mMap.addMarker(MarkerOptions().position(robledo).title("UdeA sede robledo").icon(BitmapDescriptorFactory.fromResource(R.drawable.university)))


        // antigua escuela de derecho
        val antigua= LatLng(6.2445943, -75.5600715)
        mMap.addMarker(MarkerOptions().position(antigua).title("antigua escuela de derecho").icon(BitmapDescriptorFactory.fromResource(R.drawable.university)))


        // seccional oriente
        val oriente= LatLng(5.9781, -75.26322)
        mMap.addMarker(MarkerOptions().position(oriente).title("seccional oriente").icon(BitmapDescriptorFactory.fromResource(R.drawable.university)))


        // seccional occidente

        val occidente= LatLng(6.552666, -75.8251181)
        mMap.addMarker(MarkerOptions().position(occidente).title("seccional occidente").icon(BitmapDescriptorFactory.fromResource(R.drawable.university)))


        // sede bajo cauca
        val cauca= LatLng(7.9933627, -75.2038055)
        mMap.addMarker(MarkerOptions().position(cauca).title("sede bajo cauca").icon(BitmapDescriptorFactory.fromResource(R.drawable.university)))


        // sede sonson

        val sonson= LatLng(5.6973074, -75.3140648)
        mMap.addMarker(MarkerOptions().position(sonson).title("sede sonson").icon(BitmapDescriptorFactory.fromResource(R.drawable.university)))


    }
    private fun setUpMap() {

        //Analiza el permisos de acceso a la ubicación
        if (ActivityCompat.checkSelfPermission(this,
                android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION), LOCATION_PERMISSION_REQUEST_CODE)
            return
        }
        mMap.isMyLocationEnabled = true

        fusedLocationClient.lastLocation.addOnSuccessListener(this) {location ->
            if (location != null){
                lastLocation = location
                val currentLatLong = LatLng(location.latitude, location.longitude)
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLatLong, 11f))
            }
        }

    }




}
