package com.example.listadeparticipantes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlin.properties.Delegates

class ParticipanteAdapter : RecyclerView.Adapter<ParticipantesViewHolder>() {
    val items : List <Participante> by Delegates.observable(emptyList()) {_ :}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParticipantesViewHolder {
        return ParticipantesViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_participantes, parent, false)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ParticipantesViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


}

class ParticipantesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
   val nametextView = itemView.findViewById<TextView>(R.id.nome)
    val idadetextView = itemView.findViewById<ImageView>(R.id.idade)
    fun bind(item: Participante) {
        with(itemView) {

        }


    }
}