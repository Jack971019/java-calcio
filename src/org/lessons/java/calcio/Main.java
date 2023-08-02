package org.lessons.java.calcio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class Main {

    private static final String[] nomiGiocatori = { "Lionel Messi", "Cristiano Ronaldo", "Neymar Jr.", "Kylian Mbappé", "Robert Lewandowski",
            "Kevin De Bruyne", "Sergio Ramos", "Luka Modric", "Virgil van Dijk", "Mohamed Salah",
            "Harry Kane", "Karim Benzema", "Manuel Neuer", "Eden Hazard", "Raheem Sterling",
            "Antoine Griezmann", "Luis Suárez", "Sadio Mané", "Toni Kroos", "Pierre-Emerick Aubameyang",
            "Romelu Lukaku", "Sergio Agüero", "Jadon Sancho", "Alisson Becker", "Gareth Bale",
            "Jan Oblak", "Paul Pogba", "Marcelo Vieira", "Joshua Kimmich", "Marc-André ter Stegen",
            "Thibaut Courtois", "Ciro Immobile", "N'Golo Kanté", "Marco Reus", "Bruno Fernandes",
            "Hakim Ziyech", "Ángel Di María", "Zlatan Ibrahimović", "Christian Pulisic", "Dries Mertens",
            "Alexandre Lacazette", "Hakimi Achraf", "Lucas Hernández", "João Félix", "Jordi Alba",
            "Kai Havertz", "Kalidou Koulibaly", "Gianluigi Donnarumma", "Timo Werner", "Frenkie de Jong",
            "Paulo Dybala", "Raphinha", "Federico Chiesa", "Bernardo Silva", "Wojciech Szczęsny",
            "Matthijs de Ligt", "Marquinhos", "Thomas Müller", "Ferran Torres", "Niklas Süle",
            "Andrew Robertson", "James Rodríguez", "Dani Carvajal", "Fabio Quagliarella", "Victor Osimhen",
            "Stefan de Vrij", "Duván Zapata", "Leon Goretzka", "Nicolo Barella", "Ederson Moraes",
            "Memphis Depay", "Alejandro Gómez", "Álvaro Morata", "Rúben Dias", "José María Giménez",
            "Jude Bellingham", "João Cancelo", "Kieran Trippier", "Leonardo Bonucci", "Arthur Melo",
            "Miralem Pjanić", "Roberto Firmino", "Lucas Paquetá", "Ben Chilwell", "Renato Sanches",
            "Lucas Ocampos", "Nicolò Zaniolo", "Cengiz Ünder", "Rúben Neves", "Emil Forsberg",
            "Boubacar Kamara", "Lucas Tousart", "Jonathan David", "Ismaïla Sarr", "Dani Olmo",
            "Phil Foden", "Eduardo Camavinga", "Gianluigi Buffon", "Leon Bailey", "Thomas Partey",
            "Ibrahima Konaté", "Ryan Gravenberch", "Mason Mount", "Ozan Kabak", "Donyell Malen",
            "Giovanni Reyna", "Sergej Milinković-Savić", "Cristian Romero", "Alessandro Bastoni",
            "Ricardo Pereira"
    };

    private static final String[] ruoliGiocatori = {
            "DC","DC", "TS", "TD", "CC", "CC", "CC", "AS", "AD", "ATT"
    };

    private static final String[] strategieAllenatore = {
            "OFFENSIVA", "DIFENSIVA", "AMPIEZZA", "RIPARTENZA", "SPECCHIO",
    };


    public static void main(String[] args) {
        Random random = new Random();

        List<Giocatore> listaGiocatori = new ArrayList<>();

        /*int portiere = (random.nextInt(0, nomiGiocatori.length));
        int etaPortiere = random.nextInt(16, 45 );
        Giocatore portieresquadra = new Giocatore(nomiGiocatori[portiere], etaPortiere, "POR");*/ // creare portiere sempre



        for (int i = 0; i < 11; i++) {

            int giocatore = random.nextInt(0, nomiGiocatori.length);
            int ruolo = random.nextInt(0, ruoliGiocatori.length);
            int eta = random.nextInt(16, 40);

            Giocatore nuovoGiocatore = new Giocatore(nomiGiocatori[giocatore], eta, ruoliGiocatori[ruolo]);
            listaGiocatori.add(nuovoGiocatore);
        }


        int etaLeenatore = random.nextInt(45, 75);
        int strategiaAllenatoreSquadra = random.nextInt(0, strategieAllenatore.length);

        Allenatore nuovoAllenatore = new Allenatore("Mourinho", etaLeenatore, strategieAllenatore[strategiaAllenatoreSquadra]);

        Squadra nuovaSquadrasquadra = new Squadra(listaGiocatori, nuovoAllenatore);

        System.out.println(" la squadra ospite ha:" + nuovaSquadrasquadra);

        // SQUADRA 2

        for (int i = 0; i < 11; i++) {

            int giocatore = random.nextInt(0, nomiGiocatori.length);
            int ruolo = random.nextInt(0, ruoliGiocatori.length);
            int eta = random.nextInt(16, 40);

            Giocatore nuovoGiocatore = new Giocatore(nomiGiocatori[giocatore], eta, ruoliGiocatori[ruolo]);
            listaGiocatori.add(nuovoGiocatore);
        }

        Allenatore nuovoAllenatoreSquadra1 = new Allenatore("Guardiola", 45, strategieAllenatore[strategiaAllenatoreSquadra]);

        Squadra nuovaSquadraCasa = new Squadra(listaGiocatori, nuovoAllenatoreSquadra1);

        System.out.println("La squadra di casa ha:" + nuovaSquadraCasa);


        // SIMULAZIONE PARTITA

        Partita partita = new Partita(nuovaSquadrasquadra, nuovaSquadraCasa, 0);

        System.out.println("partita iniziata");
        System.out.println("GOOOOL");
        partita.aggiungigol();
        System.out.println("GOOOOL");
        partita.aggiungigol();
        System.out.println("GOOOOL");
        partita.aggiungigol();

        System.out.println("Partita finita");

        System.out.println("nella paritta sono stati segnati:" + partita.golTotali + "\s" + "gol");

    }
}
