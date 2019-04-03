package com.example.es_birra


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.es_birra.datamodel.Database
import kotlinx.android.synthetic.main.padre_fragment.*
/**
 * A simple [Fragment] subclass.
 *
 */
class Padre_fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.padre_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Imposto il layout manager a lineare per avere scrolling in una direzione
        lista_birre.layoutManager = LinearLayoutManager(activity)

        // Associo l'adapter alla RecyclerView
        lista_birre.adapter = Adapter(Database.getElencoBirre(), requireContext())
    }

}
