package org.lessons.java.calcio;

import java.util.ArrayList;
import java.util.List;

public class Squadra {

    // ATTRIBUTI

    private List<Giocatore> listagiocatori = new ArrayList<>();
    private Allenatore allenatore;

    // COSTRUTTORI


    public Squadra(List<Giocatore> giocatore, Allenatore allenatore) {
        this.listagiocatori = giocatore;
        this.allenatore = allenatore;
    }

    // METODI

    // metodo per aggiungere giocatori alla lista

    public  void aggiungiGiocatore(Giocatore giocatore){
        listagiocatori.add(giocatore);
    }

    @Override
    public String toString() {
        return "giocatori" + listagiocatori +
                " e ha come allenatore=" + allenatore +
                '}';
    }
}
