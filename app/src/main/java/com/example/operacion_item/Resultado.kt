package com.example.operacion_item

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_resultado.*

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        var numero1=intent.getIntExtra("numeros1",0)
        var ope=intent.getStringExtra("operacion")
        var numero2=intent.getIntExtra("numeros2",0)

        if (ope=="Suma") {
            var sumas = (numero1 + numero2)
            tvFinal.text = ope +'\n' + sumas
        }
        if (ope=="Resta"){
            var resta = (numero1 - numero2)
            tvFinal.text = ope +'\n' +resta
        }
        if (ope=="Division"){
            var div = (numero1 / numero2)
            tvFinal.text = ope +'\n' +div
        }
        if (ope=="Multiplicacion"){
            var mult = (numero1 * numero2)
            tvFinal.text = ope +'\n' +mult
        }
    }
}



