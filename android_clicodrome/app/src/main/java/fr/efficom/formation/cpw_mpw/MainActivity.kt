package fr.efficom.formation.cpw_mpw

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var compteur = 0
    var compteur2 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus1.setOnClickListener {
            //verbose
            Log.v("plus1", "compteur= $compteur")
            //debug
            Log.d("plus1", "compteur= $compteur")
            //info
            Log.i("plus1", "compteur= $compteur")
            //warn
            Log.w("plus1", "compteur= $compteur")
            //error
            Log.e("plus1", "compteur= $compteur")
            compteur += 1
            zoneTexte.text = "$compteur"
        }

        reset1.setOnClickListener {
            compteur = 0
            zoneTexte.text = "0"
        }

        plus2.setOnClickListener {
            Log.d("plus2", "compteur2= $compteur2")
            compteur2 += 1
            zoneTexte2.text = "$compteur2"
        }

        reset2.setOnClickListener {
            compteur2 = 0
            zoneTexte2.text = "0"
        }
    }
}
