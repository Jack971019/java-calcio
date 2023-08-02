package org.lessons.java.calcio;

public class Persona {
    // ATTRIBUTI

     private String nome;

    private int eta;

    // COSTRUTTORI

    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }


    // GETTER AND SETTER

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }


    // METODI


    @Override
    public String toString() {
        return "nome giocatore:" + " - " + nome + '\'' +
                ", eta:" + " - " + eta;
    }

}
