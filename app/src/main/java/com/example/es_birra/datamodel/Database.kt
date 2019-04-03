package com.example.es_birra.datamodel

/**
 * Singleton per simulare il funzionamento di un ipotetico Database
 * quando si definisce un object si sta creando un singleton, cioè qualcosa
 * che può essere istanziato una sola volta, in modo da non creare più di un database
 */
object Database {

    // Array di tipo Birra
    private var birre = ArrayList<Birra>()

    // Inizializzatore per popolare il database con qualche dato
    init {
        for (i in 0..2) {
            birre.add(Birra("Blonde", 6.6f))
            birre.add(Birra("La Biere du Demon", 12f))
            birre.add(Birra("BrewMaster's Choice IPA", 5.8f))
        }
    }

    // Metodo che restituisce l'elenco di tutte le birre presenti, get del vettore
    fun getElencoBirre(): ArrayList<Birra> {
        return birre
    }
}