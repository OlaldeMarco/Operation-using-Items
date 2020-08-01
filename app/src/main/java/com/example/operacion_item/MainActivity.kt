package com.example.operacion_item

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnResultado = findViewById<Button>(R.id.btnResultado)
        val mispn = findViewById<Spinner>(R.id.spOperacion)
        ArrayAdapter.createFromResource(
            this,
            R.array.ArrayOperacion,
            android.R.layout.simple_spinner_item
        ).also { adapter -> adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
            mispn.adapter = adapter
        }//fin del spinner
        btnResultado.setOnClickListener(View.OnClickListener {
            val intencionOperacion = Intent(this,Resultado::class.java)
            var numero1=etNum1.text.toString().toInt()
            var numero2=etNum2.text.toString().toInt()
            var operacion = mispn.getSelectedItem().toString()
            intencionOperacion.putExtra("operacion", operacion)
            intencionOperacion.putExtra("numeros1", numero1)
            intencionOperacion.putExtra("numeros2", numero2)
            startActivity(intencionOperacion)
        })
    }
}