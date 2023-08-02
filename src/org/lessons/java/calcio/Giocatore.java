package org.lessons.java.calcio;

public class Giocatore extends Persona{

    // ATTRIBUTI

    private String ruolo;

    // COSTRUTTORI

    public Giocatore(String nome, int eta, String ruolo) {
        super(nome, eta);
        this.ruolo = ruolo;
    }


    // GETTER E SETTER

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }


    // METODI


    @Override
    public String toString() {
        return super.toString()+ "Giocatore" +
                "ruolo='" + ruolo + '\'';
    }
}
