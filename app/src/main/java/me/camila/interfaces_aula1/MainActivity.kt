package me.camila.interfaces_aula1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnSalvar = this.findViewById<Button>(R.id.btnSalvar)
        btnSalvar.setOnClickListener {


            var txtNome = this.findViewById<EditText>(R.id.txtNome)
            var txtEmail = this.findViewById<EditText>(R.id.txtEmail)



            Toast.makeText(this,"Bem-Vindo " + txtNome.text.toString() + " seu e-mail é " + txtEmail.text.toString(),
                Toast.LENGTH_LONG).show()
        }
    }
}

