package com.example.intentsbundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btSuma.setOnClickListener {
            val intent :Intent = Intent(this,MainActivity2 :: class.java)
            intent.putExtra("valor","Hola")
            intent.putExtra("valor2","prueba")
            intent.putExtra("operacion","+")
            startActivityForResult(intent,1)
        }
        btnresta.setOnClickListener {
            val intent :Intent = Intent(this,MainActivity3 :: class.java)
            intent.putExtra("valor","Hola")
            intent.putExtra("valor2","prueba")
            intent.putExtra("operacion","-")
            startActivityForResult(intent,2)
        }
        btnmulti.setOnClickListener {
            val intent :Intent = Intent(this,MainActivity4 :: class.java)
            intent.putExtra("valor","Hola")
            intent.putExtra("valor2","prueba")
            intent.putExtra("operacion","*")
            startActivityForResult(intent,3)
        }
        btndivision.setOnClickListener {
            val intent :Intent = Intent(this,MainActivity5 :: class.java)
            intent.putExtra("valor","Hola")
            intent.putExtra("valor2","prueba")
            intent.putExtra("operacion","/")
            startActivityForResult(intent,4)
        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode== RESULT_OK){
            if(requestCode==1 || requestCode==2 || requestCode==3||requestCode==4 ){
                val bundle=data?.extras
                if(bundle!=null){
                    val resu=bundle.getString("resultado")
                    txtesultado.text=resu
                    Toast.makeText(this,resu,Toast.LENGTH_SHORT).show()
                }
            }
        }

    }


}


