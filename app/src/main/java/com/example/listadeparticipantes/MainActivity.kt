package com.example.listadeparticipantes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val participantes: List<Participante> = listOf(
            Participante(image = R.drawable.arthur26anos, name = "Arthur", idade = "26"),
            Participante(image = R.drawable.biu29anos, name = "Biu", idade = "29"),
            Participante(image = R.drawable.caio32anos, name = "Caio", idade = "32"),
            Participante(image = R.drawable.camila26anos, name = "Camila", idade = "26"),
            Participante(image = R.drawable.carla30anos, name = "Carla", idade = "30"),
            Participante(image = R.drawable.fiuk30anos, name = "Fiuk", idade = "30"),
            Participante(image = R.drawable.gilberto29anos, name = "Gilberto", idade = "29"),
            Participante(image = R.drawable.joao24anos, name = "João", idade = "24"),
            Participante(image = R.drawable.juliette31anos, name = "Juliette", idade = "31"),
            Participante(image = R.drawable.karol34anos, name = "Karol", idade = "34"),
            Participante(image = R.drawable.kerline28anos, name = "Kerline", idade = "28"),
            Participante(image = R.drawable.lucas24anos, name = "Lucas", idade = "24"),
            Participante(image = R.drawable.lumena29anos, name = "Lumena", idade = "29"),
            Participante(image = R.drawable.negodi26anos, name = "Nego Di", idade = "26"),
            Participante(image = R.drawable.pocah26anos, name = "Pocah", idade = "26"),
            Participante(image = R.drawable.projota34anos, name = "Projota", idade = "34"),
            Participante(image = R.drawable.rodolfo32anos, name = "Rodolfo", idade = "32"),
            Participante(image = R.drawable.sarah29anos, name = "Sarah", idade = "29"),
            Participante(image = R.drawable.thais27anos, name = "Thais", idade = "27"),
            Participante(image = R.drawable.vihtube20anos, name = "Vih Tube", idade = "20")
        )
    }
}