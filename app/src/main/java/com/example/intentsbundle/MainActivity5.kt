package com.example.intentsbundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main2.btnRegresar
import kotlinx.android.synthetic.main.activity_main5.*

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val bundle =intent.extras
        if(bundle !=null){

            val valor2=bundle.getString("valor2")
            Toast.makeText(this,valor2, Toast.LENGTH_SHORT).show()
        }
        btnRegresar.setOnClickListener {
            val variable1=findViewById<EditText>(R.id.numero14)
            val variable2=findViewById<EditText>(R.id.numero24)
            val variable6=variable1.text.toString()
            val variable7=variable2.text.toString()
            val intent: Intent = Intent()
            intent.putExtra("resultado",dividir(variable6,variable7))
            setResult(RESULT_OK,intent)
            finish()
        }
    }
    private fun dividir(numero1:String,numero2:String): String {
        val numero11=numero1.toFloat()
        val numero22=numero2.toFloat()
        val numero3=numero11/numero22
        return numero3.toString();
    }
}