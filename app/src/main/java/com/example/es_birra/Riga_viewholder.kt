package com.example.es_birra

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.riga_layout.view.*

/**
 * ViewHolder utilizzato per le righe della RecyclerView con l'elenco delle birre
 * contiene le proprietà corrispondenti agli elementi della riga
 */
//associo i valori della riga layout a delle costanti, le quali poi verranno utilizzate nell'adapter
//per associare i valori del database alle varie righe
class Riga_viewholder(view: View) : RecyclerView.ViewHolder(view) {
    val tvNome = view.nome_view
    val tvGradazione = view.grad_view
}