package br.ufpr.frasedodia

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun quote(view: View) {
        val quotes = arrayOf(
            "Enfrente os problemas e leve a melhor!",
            "Quando estiver em duvidas e perdido, incendeie o seu coração",
            "Você só perde quando desiste",
            "O mundo é duro, mas com persistencia você consegue dobra-lo",
            "você não tem inimigos, ninguém tem",
            "Na dúvida pense, o que o Naruto faria ?",
            "A vida é uma alegria, e a alegria só é sentida em raros momentos de distração"
        )

        val index = (0..6).random()
        val textView = findViewById<TextView>(R.id.textViewOutput)
        textView.text = quotes[index]
    }
}