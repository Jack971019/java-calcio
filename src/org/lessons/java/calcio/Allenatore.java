package org.lessons.java.calcio;

public class Allenatore extends Persona{

    // ATTRIBUTI

    private String strategia;

    // COSTRUTTORI

    public Allenatore(String nome, int eta, String strategia) {
        super(nome, eta);
        this.strategia = strategia;
    }


    // GETTER E SETTER

    public String getStrategia() {
        return strategia;
    }

    public void setStrategia(String strategia) {
        this.strategia = strategia;
    }


    // METODI


    @Override
    public String toString() {
        return super.toString()+ "Allenatore" +
                "strategia='" + strategia + '\'';
    }
}
