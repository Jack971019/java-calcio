package org.lessons.java.calcio;


import java.util.Random;

public class Partita {

Random random = new Random();

    // ATTRIBUTI

    private Squadra squadraDiCasa;

    private Squadra squadraFuoriCasa;

    private boolean iniziata = false;

    protected int golTotali;




    // COSTRUTTORI

    public Partita(Squadra squadraDiCasa, Squadra squadraFuoriCasa, int golTotali) {
        this.squadraDiCasa = squadraDiCasa;
        this.squadraFuoriCasa = squadraFuoriCasa;
        this.golTotali = 0;
    }


    // METODI

    // scegli squadra casuale che segna

    public int segnaSquadracasuale(){
        int sceglisquadraCasuale = random.nextInt(2);
        return sceglisquadraCasuale;
    }

    // metodo per aggiungere gol

    public void segnaGol(){
        if(iniziata){
            System.out.println("la partita non è ancora iniziata");
        } else if(!iniziata){
            segnaSquadracasuale();
        }

    }

    public void aggiungigol(){
        golTotali ++;
    }

    // metodo per far iniziare la partita

    public  void iniziaPartita(){
        iniziata = true;

    }






}
