package org.lessons.java.calcio;

public class Arbitro extends Persona{

    private String ruoloArbitro;

    public Arbitro(String nome, int eta, String ruoloArbitro) {
        super(nome, eta);
        this.ruoloArbitro = ruoloArbitro;
    }

    public String getRuoloArbitro() {
        return ruoloArbitro;
    }

    // METODI

    @Override
    public String toString() {
        return super.toString() + "Arbitro" +
                "ruoloArbitro='" + ruoloArbitro + '\'';
    }
}
