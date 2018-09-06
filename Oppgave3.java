import java.util.ArrayList;

public class Oppgave3 {

    public static int antallUlikeUsortert(int[] a) {
        int antallUlikeVerdier = 0; // hjelpevariabel som teller antall ulike heltall

        ArrayList<Integer> UlikeVerdier = new ArrayList<>(); // Arraylist som inneholder heltall

        for(int i = 0; i < a.length; i++) { // Går igjennom hele tabellen
            if(!UlikeVerdier.contains(a[i])) { // Hvis ikke arraylisten inneholder heltallet fra før vil det heltallet bli lagt til i arraylisten
                UlikeVerdier.add(a[i]);
            }
        }

        if(UlikeVerdier.size() == 1) { // Alle heltall som allerede er lagt til i arraylisten vil bli fjernet fra int[]
            antallUlikeVerdier = 0;
        } else {
            antallUlikeVerdier = UlikeVerdier.size(); // Størrelsen på arraylisten er antallet ulike heltall
        }

        return antallUlikeVerdier;
    }
}
}
