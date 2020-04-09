package medellin.mapa.google


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var btnSitios: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnSitios = findViewById<View>(R.id.btn_sitios) as Button

        btnSitios.setOnClickListener(View.OnClickListener {
            val intent = Intent(applicationContext, MapsActivity1::class.java)
            startActivity(intent)
        })
    }

}