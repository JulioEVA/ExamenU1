package mx.edu.itson.potros.examenu1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gCelcius: EditText = findViewById(R.id.etC)
        val gFarenheit: EditText = findViewById(R.id.etF)
        val btnCelcius: Button = findViewById(R.id.btnGC)
        val btnFarenheit: Button = findViewById(R.id.btnGF)

        btnCelcius.setOnClickListener {
            if (!gFarenheit.text.isBlank() || !gFarenheit.text.isEmpty()){
                val resultado = (gFarenheit.text.toString().toDouble() - 32) / 1.8
                val formattedNumber="%.2f".format(resultado)
                gCelcius.setText(formattedNumber)
            }
        }

        btnFarenheit.setOnClickListener {
            if (!gCelcius.text.isBlank() || !gCelcius.text.isEmpty()){
                val resultado = gCelcius.text.toString().toDouble() * 1.8 + 32
                val formattedNumber="%.2f".format(resultado)
                gFarenheit.setText(formattedNumber)
            }
        }
    }
}