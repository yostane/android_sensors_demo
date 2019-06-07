package fr.efficom.formation.cpw_mpw

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var compteur = 0
    var compteur2 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus1.setOnClickListener {
            compteur += 1
            zoneTexte.text = "$compteur"
        }

        reset1.setOnClickListener {
            compteur = 0
            zoneTexte.text = "0"
        }

        plus2.setOnClickListener {
            compteur2 += 1
            zoneTexte2.text = "$compteur2"
        }

        reset2.setOnClickListener {
            compteur2 = 0
            zoneTexte2.text = "0"
        }
    }
}
