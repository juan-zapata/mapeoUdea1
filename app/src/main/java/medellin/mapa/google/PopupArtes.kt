package medellin.mapa.google

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics

class PopupArtes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popup_artes)
        val medidasVentana = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(medidasVentana)
        val ancho = medidasVentana.widthPixels
        val alto = medidasVentana.heightPixels
        window.setLayout((ancho * 0.75).toInt(), (alto * 0.85).toInt())
    }
}
