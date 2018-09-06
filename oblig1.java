package Algoritme.oblig;

import Algoritme.Hjelpeklasse.Tabell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class oblig1 {
    public static void main(String[] args){
        int[] test1= null;

        int[] a = Tabell.randPerm(27);              // en tilfeldig tabell

          System.out.println("Det initielle arrayet: \n");
            System.out.println(Arrays.toString(a));
            maks(a);
            System.out.println("Den største verdien: " + maks(a));
            System.out.println("Det sorterte arrayet, etter størrelse: ");
            System.out.println("\n"+Arrays.toString(a)); /* */
/***/
           // ombyttinger(test2);
          // maks(test2);
           // System.out.println("Det ble gjort : " + ombyttinger(a) +" ombyttinger");
      // System.out.println("\n"+Arrays.toString(test2));

    }
    //**********************
    //Oppgave 1*************
    //**********************
    //1. Det skjer flest innbyttinger når den største verdien er helt fremme
    //2. Det blir færrest innbyttinger når den største og minste verdien er på deres
    // respekterende plasser. Størst, helt bak. Minst, helt foran.
    // 3. Det blir ca. n/2 gang innbyttinger i gjennomsnitt
    // n = 20, 17 bytt, med tilfeldige tall, 15, 15, 17, 15, 15.5 bytt i gjennomsnitt, når n = 20
    // n = 10, 9,7,5,9,7,8 gjennomsnitt for n = 10 = 9+7+5+9+7+8 =x => x/6 = 7.5 bytt i gjennomsnitt
    // n = 5, 3,2,4,3,2 gjennomsnitt : 2.8 bytt i gjennomsnitt når n = 5.
    public static int maks(int[] a){

            if(a ==null)
                throw new NoSuchElementException ("Tabell er tom");
                //itererer gjennom tabellen


             int m = 0;
             int maksverdi = a[m];

            for( int i = 1; i <a.length; i++){
                //hvis a[i-1] er større enn a[i]
                //så skifter de plass
              /* */ if(a[i-1]> a[i]){

                    int temp = a[i-1];
                    a[i-1]= a[i];
                    a[i] = temp;

                }

            }
    //}
            //skriver ut verdi, dermed er det -1. ellers outofBounds
            return a[a.length-1];
    }

    public static int ombyttinger(int[] a){

        System.out.println("Det initielle arrayet:\n " + Arrays.toString(a));

        if(a ==null)
            throw new NoSuchElementException ("Tabell er tom");
        //itererer gjennom tabellen

        int antall = 0;
        int m = 0;
        int maksverdi = a[m];

        for( int i = 1; i <a.length; i++){
            //hvis a[i-1] er større enn a[i]
            //så skifter de plass
            //
            /* */

            if(a[i-1]> a[i]){
                int temp = a[i-1];
                a[i-1]= a[i];
                a[i] = temp;
                antall++;
                System.out.println("\n"+Arrays.toString(a) + " ombytting nr: " +i);

            }else{

            }
        }
        //}

        return antall;
    }

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
     * @param a
     * @return
     */

    public static int antallUlikeUsortert(int[] a) {
        // Hjelpevariabel som teller antall ulike heltall
        int antallUlikeVerdier = 0;

        ArrayList<Integer> UlikeVerdier = new ArrayList<>();

        // Legger til alle heltall i arraylisten som ikke er lagt inn fra før av
        for(int i = 0; i < a.length; i++) {
            if(!UlikeVerdier.contains(a[i])) {
                UlikeVerdier.add(a[i]);
            }
        }

        // Størrelsen på arraylisten er lik antallet ulike heltall i tabellen
        if(UlikeVerdier.size() == 1) {
            antallUlikeVerdier = 0;
        } else {
            antallUlikeVerdier = UlikeVerdier.size();
        }

        return antallUlikeVerdier;
    }


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
        int index = 0;

        for (String g : s) {
            index += g.length();
        }

        int[] a = new int[n];

        for (int i = 0;i < index; i++) {
            for(int j = 0;j < n; j++) {
                if(a[j] < s[j].length()) {
                    resultat += s[j].toCharArray()[a[j]];
                    a[j]++;
                }
            }
        }

        return resultat;
    }
}
