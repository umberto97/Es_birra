package com.example.es_birra

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.es_birra.datamodel.Birra

class Adapter(val dataset: ArrayList<Birra>, val context: Context) : RecyclerView.Adapter<Riga_viewholder>() {

    // Invocata per creare un ViewHolder
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): Riga_viewholder {
        // Crea e restituisce un viewholder, effettuando l'inflate del layout relativo alla riga
        return Riga_viewholder(LayoutInflater.from(context).inflate(R.layout.riga_layout, viewGroup, false))
    }

    // Invocata per conoscere quanti elementi contiene il dataset
    override fun getItemCount(): Int {
        return dataset.size
    }

    // Invocata per visualizzare all'interno del ViewHolder il dato corrispondente alla riga
    override fun onBindViewHolder(viewHolder: Riga_viewholder, position: Int) {
        val birra = dataset.get(position)
//scrivo il valore preso dal database nel textview
        viewHolder.tvNome.text = birra.Nome
        viewHolder.tvGradazione.text= birra.Gradazione.toString()
    }
}