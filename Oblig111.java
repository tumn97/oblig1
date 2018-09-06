package Algoritme.oblig;

import Algoritme.Hjelpeklasse.Tabell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oblig1 {

    /**
    * Oppgave 1
    * */

    //1. Det skjer flest innbyttinger når den største verdien er helt fremme
    //2. Det blir færrest innbyttinger når den største og minste verdien er på deres
    // respekterende plasser. Størst, helt bak. Minst, helt foran.
    // 3. Det blir ca. n/2 gang innbyttinger i gjennomsnitt
    // n = 20, 17 bytt, med tilfeldige tall, 15, 15, 17, 15, 15.5 bytt i gjennomsnitt, når n = 20
    // n = 10, 9,7,5,9,7,8 gjennomsnitt for n = 10 = 9+7+5+9+7+8 =x => x/6 = 7.5 bytt i gjennomsnitt
    // n = 5, 3,2,4,3,2 gjennomsnitt : 2.8 bytt i gjennomsnitt når n = 5.
    public static int maks(int[] a) {

        if (a == null || a.length == 0)
            throw new NoSuchElementException("Tabell er tom");
        //itererer gjennom tabellen


        int m = 0;
        int maksverdi = a[m];

        for (int i = 1; i < a.length; i++) {
            //hvis a[i-1] er større enn a[i]
            //så skifter de plass
            /* */
            if (a[i - 1] > a[i]) {

                int temp = a[i - 1];
                a[i - 1] = a[i];
                a[i] = temp;

            }

        }
        //}
        //skriver ut verdi, dermed er det -1. ellers outofBounds
        return a[a.length - 1];
    }

    public static int ombyttinger(int[] a) {


        if (a == null || a.length == 0)
            throw new NoSuchElementException("Tabellen er tom, dermed ingen maks verdi");

        //itererer gjennom tabellen

        int antall = 0;
        int m = 0;
        int maksverdi = a[m];

        for (int i = 1; i < a.length; i++) {
            //hvis a[i-1] er større enn a[i]
            //så skifter de plass
            //
            /* */

            if (a[i - 1] > a[i]) {
                int temp = a[i - 1];
                a[i - 1] = a[i];
                a[i] = temp;
                antall++;


            }
            //}


        } return antall;

    }







    /**
     * Oppgave 2,
     * @param a
     * @return
     */
    public static int antallUlikeSortert(int[] a) {
        int antallUlike = 1;

        if (a.length == 0) {
            return 0;
        }

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                throw new IllegalStateException("Arrayet er ikke sortert i stigende rekkefølge");
            }
            else if (a[i] != a[i + 1]){
                ++antallUlike;
            }
        }

        return antallUlike;
    }
    /**
     * Oppgave 3
     * */
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

    /***
     * Oppgave 4
     */
    public static void delsortering(int[] a) {

        int first = 0;
        int last = a.length - 1;


        for (int i = 1; i < a.length; ++i) {

            if (/*a[i - 1] > a[i] && */maks(a) % 2 == 0) {

               // if () {

                    int temp1 = a[i];
                    a[i] = a[last];
                    a[last] = temp1;
                   // last--;


                } else if(maks(a) % 2 !=0) {
                    int temp1 = a[i];
                    a[i] = a[first];
                    a[first] = temp1;
                    first++;

                }
            }
        }





    /**
     * Oppgave 5
     *
     *
     *
    * */

    public static void rotasjon(char[] a){
        int indeks = 0;
        int n = a.length-1;
        for(int i = 0; i < a.length-1; i++){

            char flytt = a[n];
            a[n] = a[indeks];
            a[indeks]  = flytt;
            indeks++;


        }


    }


    /**
     * Oppgave 6
     */



    /**
     * Oppgave 7a
     * @param s første string
     * @param t andre string
     * @return stringen
     */
    public static String flett(String s, String t) {
        String resultat = "";
        int index;

        if (s.length() >= t.length()) {
            index = t.length();
        } else  {
            index = s.length();
        }

        for(int i=0; i<index; i++){
            resultat += s.substring(i, i+1) + t.substring(i, i+1);
        }

        if(s.length() < t.length()) resultat += t.substring(s.length());
        if(s.length() > t.length()) resultat += s.substring(t.length());

        return resultat;
    }

    /**
     * Oppgave 7b
     * @param s Valgt string array
     * @return
     */
    public static String flett(String... s) {

        String resultat = "";
        int n = s.length;

        int[] a = new int[s.length];

        for (int i = 0;i < n; i++) {
            for(int j = 0;j < n; j++) {
                if(a[j] < s[j].length()) {
                    resultat += s[j].toCharArray()[a[j]];
                    a[j]++;
                }
            }
        }

        return resultat;
    }

    /***
     * Oppgave 8
     */




    /**
     * Oppgave 9
     */
    public static int[] tredjeMin(int[] a) {

        int n = a.length;

        if (n < 3) {
            throw new IllegalArgumentException("a.length(" + n + ") < 3!");
        }

        int min1 = a[0];
        int min2 = a[0];
        int min3 = a[0];

        int m1 = 0;
        int m2 = 0;
        int m3 = 0;

        for (int i = 0; i < a.length; i++) {

            if (min1 > a[i]) {

                min2 = min1;
                min1 = a[i];
                m1 = i;

            } else if (min2 > a[i]) {

                min2 = a[i];
                m2 = i;

            } else if (min3 > a[i] && min2 < a[i]) {

                min3 = a[i];
                m3 = i;
            }
        }

        int SmallNumberIndex[] = {m1, m2, m3};

        return SmallNumberIndex;
    }



    /**
     *
     * Oppgave 10
    * **/



}
