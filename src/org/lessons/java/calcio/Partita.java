package org.lessons.java.calcio;

public class Partita {

    // ATTRIBUTI

    String squadraDiCasa;

    String squadraFuoriCasa;

    // COSTRUTTORI

    public Partita(String squadraDiCasa, String squadraFuoriCasa) {
        this.squadraDiCasa = squadraDiCasa;
        this.squadraFuoriCasa = squadraFuoriCasa;
    }


    // METODI


    @Override
    public String toString() {
        return "Partita{" +
                "squadraDiCasa='" + squadraDiCasa + '\'' +
                ", squadraFuoriCasa='" + squadraFuoriCasa + '\'' +
                '}';
    }
}
