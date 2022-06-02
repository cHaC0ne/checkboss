package com.example.checkbox
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import com.example.checkbox.databinding.ActivityMainBinding
import java.text.FieldPosition

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)
        val adaptador : ArrayAdapter<*> = ArrayAdapter.createFromResource(
            this,R.array.opciones, android.R.layout.simple_spinner_item
        )
        b.spinner.adapter = adaptador
        b.spinner.onItemSelectedListener = object  : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent : AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ){
                Toast.makeText(this@MainActivity,"Seleccion: ".plus(position.toString()),
                Toast.LENGTH_SHORT).show()

            }

            override fun onNothingSelected(parent:  AdapterView<*>?) {
                Toast.makeText(this@MainActivity,"Sin Seleccion",Toast.LENGTH_SHORT).show()

            }
        }

        b.chB1.setOnClickListener{
            if (b.chB1.isChecked) {
                b.textView.text = "Has activado el check box 1"
            } else {
                b.textView.text = "Check Box 1 Desactivado"
            }

        }
        b.chB2.setOnClickListener {
            if (b.chB2.isChecked) {
                b.textView.text = "Has activado el check box 2"
            } else {
                b.textView.text = "Check Box 2 Desactivado"
            }
        }
        b.radioButton.setOnClickListener {
            b.textView2.text = "Opcion 1"
        }
        b.radioButton2.setOnClickListener {
            b.textView2.text = "Opcion 2"
        }
        b.radioButton3.setOnClickListener {
            b.textView2.text = "Opcion 3"
        }


    }

    fun marcos(view: View?){
        Toast.makeText(this,"Marcos Function",Toast.LENGTH_SHORT).show()
    }
    fun vicente(view: View?){
        Toast.makeText(this,"Marcos Function",Toast.LENGTH_SHORT).show()
    }

}
