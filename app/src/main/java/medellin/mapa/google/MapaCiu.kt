package medellin.mapa.google

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_mapa_ciu.view.*

class MapaCiu : AppCompatActivity() {
    private var btnIng: Button? = null
    private var btnAdmin: Button? = null
    private var btnBien: Button? = null
    private var btnBiblio: Button? = null
    private var btnTeatr: Button? = null
    private var btnMuua: Button? = null
    private var btnIdio: Button? = null
    private var btnDere: Button? = null
    private var btnExacts: Button? = null
    private var btnComunic: Button? = null
    private var btnBloque9: Button? = null
    private var btnArt: Button? = null
    private var btnFarma: Button? = null
    private var btnEco: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mapa_ciu)
        btnIng = findViewById<View>(R.id.btn_Ing) as Button
        btnIng!!.setOnClickListener(View.OnClickListener { startActivity(Intent(this@MapaCiu, PopupIngenieria::class.java)) })

        btnAdmin = findViewById<View>(R.id.btnAdmin) as Button
        btnAdmin!!.setOnClickListener(View.OnClickListener { startActivity(Intent(this@MapaCiu, PopupAdministrativo::class.java)) })

        btnBien = findViewById<View>(R.id.btnBien) as Button
        btnBien!!.setOnClickListener(View.OnClickListener { startActivity(Intent(this@MapaCiu, PopupBienestar::class.java)) })

        btnBiblio = findViewById<View>(R.id.btnBiblio) as Button
        btnBiblio!!.setOnClickListener(View.OnClickListener { startActivity(Intent(this@MapaCiu, PopupBiblioteca::class.java)) })

        btnTeatr = findViewById<View>(R.id.btnTeatr) as Button
        btnTeatr!!.setOnClickListener(View.OnClickListener { startActivity(Intent(this@MapaCiu, PopupTeatro::class.java)) })

        btnMuua = findViewById<View>(R.id.btnMuua) as Button
        btnMuua!!.setOnClickListener(View.OnClickListener { startActivity(Intent(this@MapaCiu, PopupMuseo::class.java)) })

        btnIdio = findViewById<View>(R.id.btnIdio) as Button
        btnIdio!!.setOnClickListener(View.OnClickListener { startActivity(Intent(this@MapaCiu, PopupIdiomas::class.java)) })

        btnDere = findViewById<View>(R.id.btnDere) as Button
        btnDere!!.setOnClickListener(View.OnClickListener { startActivity(Intent(this@MapaCiu, PopupDerecho::class.java)) })

        btnExacts = findViewById<View>(R.id.btnExact) as Button
        btnExacts!!.setOnClickListener(View.OnClickListener { startActivity(Intent(this@MapaCiu, PopupExactasyNaturales::class.java)) })

        btnComunic = findViewById<View>(R.id.btnComunic) as Button
        btnComunic!!.setOnClickListener(View.OnClickListener { startActivity(Intent(this@MapaCiu, PopupComunicaciones::class.java)) })

        btnBloque9 = findViewById<View>(R.id.btnBloque9) as Button
        btnBloque9!!.setOnClickListener(View.OnClickListener { startActivity(Intent(this@MapaCiu, PopupBloque9::class.java)) })

        btnArt = findViewById<View>(R.id.btnArt) as Button
        btnArt!!.setOnClickListener(View.OnClickListener { startActivity(Intent(this@MapaCiu, PopupArtes::class.java)) })

        btnFarma = findViewById<View>(R.id.btnFarma) as Button
        btnFarma!!.setOnClickListener(View.OnClickListener { startActivity(Intent(this@MapaCiu, PopupFarmaceuticasyAlimentarias::class.java)) })

        btnEco = findViewById<View>(R.id.btnEco) as Button
        btnEco!!.setOnClickListener(View.OnClickListener { startActivity(Intent(this@MapaCiu, PopupEconomicasyFinancieras::class.java)) })


    }
}
