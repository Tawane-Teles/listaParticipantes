package com.example.listadeparticipantes.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.listadeparticipantes.model.Participante
import com.example.listadeparticipantes.R
import kotlin.properties.Delegates

class ParticipanteAdapter : RecyclerView.Adapter<ParticipantesViewHolder>(), Filterable {
    var items: List<Participante> by Delegates.observable(emptyList()) { _, old, new -> if (old != new) notifyDataSetChanged() }
    var participanteItems: List<Participante> by Delegates.observable(emptyList()) { _, old, new -> if (old != new) notifyDataSetChanged() }
    var filterItems = ArrayList<Participante>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParticipantesViewHolder {
        return ParticipantesViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_participantes,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ParticipantesViewHolder, position: Int) {
        val participante = items[position]
        holder.bind(participante)
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val charSearch = constraint.toString()
                filterItems = if (charSearch.isEmpty()) {
                    participanteItems as ArrayList<Participante>
                } else {
                    val resultList = ArrayList<Participante>()
                    for (row in participanteItems) {
                        if (row.name.toLowerCase().contains(constraint.toString().toLowerCase())) {
                            resultList.add(row)
                        }
                    }
                    resultList
                }
                val filterResults = FilterResults()
                filterResults.values = filterItems
                return filterResults
            }

            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                try {
                    items = results?.values as List<Participante>
                    notifyDataSetChanged()
                } catch (e: Exception) {
                    items = participanteItems
                    notifyDataSetChanged()
                }
            }

        }
    }

}

class ParticipantesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val nametextView = itemView.findViewById<TextView>(R.id.nome)
    val idadetextView = itemView.findViewById<TextView>(R.id.idade)
    val imageView = itemView.findViewById<ImageView>(R.id.imagemparticipante)
    fun bind(item: Participante) {
        with(itemView) {
            nametextView.text = item.name
            idadetextView.text = item.idade
            imageView.setImageDrawable(resources.getDrawable(item.image))
        }


    }
}
