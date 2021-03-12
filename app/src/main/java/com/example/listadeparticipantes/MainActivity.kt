package com.example.listadeparticipantes

import android.os.Bundle
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.listadeparticipantes.adapter.ParticipanteAdapter
import com.example.listadeparticipantes.model.Participante

class MainActivity : AppCompatActivity() {
    private var list: RecyclerView? = null
    private var searchView: SearchView? = null
    private var adapterParticipante = ParticipanteAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setando no find para diferenciar os ids
        list = findViewById(R.id.listaParticipantes)
        searchView = findViewById(R.id.searchView)

        val participantes: List<Participante> = listOf(
            Participante(
                image = R.drawable.arthur26anos,
                name = "Arthur",
                idade = "26 anos"
            ),
            Participante(
                image = R.drawable.biu29anos,
                name = "Biu",
                idade = "29 anos"
            ),
            Participante(
                image = R.drawable.caio32anos,
                name = "Caio",
                idade = "32 anos"
            ),
            Participante(
                image = R.drawable.camila26anos,
                name = "Camila",
                idade = "26 anos"
            ),
            Participante(
                image = R.drawable.carla30anos,
                name = "Carla",
                idade = "30 anos"
            ),
            Participante(
                image = R.drawable.fiuk30anos,
                name = "Fiuk",
                idade = "30 anos"
            ),
            Participante(
                image = R.drawable.gilberto29anos,
                name = "Gilberto",
                idade = "29 anos"
            ),
            Participante(
                image = R.drawable.joao24anos,
                name = "João",
                idade = "24 anos"
            ),
            Participante(
                image = R.drawable.juliette31anos,
                name = "Juliette",
                idade = "31 anos"
            ),
            Participante(
                image = R.drawable.karol34anos,
                name = "Karol",
                idade = "34 anos"
            ),
            Participante(
                image = R.drawable.kerline28anos,
                name = "Kerline",
                idade = "28 anos"
            ),
            Participante(
                image = R.drawable.lucas24anos,
                name = "Lucas",
                idade = "24 anos"
            ),
            Participante(
                image = R.drawable.lumena29anos,
                name = "Lumena",
                idade = "29 anos"
            ),
            Participante(
                image = R.drawable.negodi26anos,
                name = "Nego Di",
                idade = "26 anos"
            ),
            Participante(
                image = R.drawable.pocah26anos,
                name = "Pocah",
                idade = "26 anos"
            ),
            Participante(
                image = R.drawable.projota34anos,
                name = "Projota",
                idade = "34 anos"
            ),
            Participante(
                image = R.drawable.rodolfo32anos,
                name = "Rodolfo",
                idade = "32 anos"
            ),
            Participante(
                image = R.drawable.sarah29anos,
                name = "Sarah",
                idade = "29 anos"
            ),
            Participante(
                image = R.drawable.thais27anos,
                name = "Thais",
                idade = "27 anos"
            ),
            Participante(
                image = R.drawable.vihtube20anos,
                name = "Vih Tube",
                idade = "20 anos"
            )

        )

        adapterParticipante.items=participantes
        adapterParticipante.participanteItems=participantes
        adapterParticipante.notifyDataSetChanged()
        setupRecyclerView()

    }

    private fun setupRecyclerView(){
        list?. adapter=adapterParticipante
        list?.layoutManager= androidx.recyclerview.widget.LinearLayoutManager(this)
    }
}