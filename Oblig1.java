package Algoritme.oblig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

//  Gruppe - Asians
//  s315611	- Earl John Torculas Laguardia
//  s325862 - Tuan Minh Nguyen
//  s325851	- Thevy Ngo
//  s325861	- Daniel Nguyen


public class Oblig1 {

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

    /**
     * Oppgave 1
     * @param a paramteren for tabell
     * @return returnerer en verdi
     */
    public static int maks(int[] a){

        if(a ==null || a.length==0)
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

            }else{

            }
        }
        //}

        return antall;
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

        int teller = 0;                        // Hjelpevariabel som teller opp antall ulike heltall

        for (int i = 0; i < a.length; i++) {   // Itererer igjennom hele int[] a
            boolean erUlik = false;
            for (int j = 0; j < i; j++) {      // Itererer gjennom a[i] og a[j] samtidig
                if (a[i] == a[j]) {            // Hvis a[i] og a[j] har sammme verdi setter vi
                    erUlik = true;             // den boolske variabelen erUlike på true og hopper ut av
                    break;                     // nåværende iterasjon og fortsetter videre på neste iterasjon
                }
            }

            if (!erUlik) {                     // For hver iterasjon erUlik er satt til false
                teller++;                      // plusser vi med 1 i teller
            }

        }
        return teller;                         // Returnerer verdien til teller som er antall ulike heltall

    }

    /**
     * Oppgave 4
     */


    public static void delsortering(int[] a) {
        int lengde = a.length;
        int v = 0, h = lengde - 1;

        if (a.length == 0) return;

        while (v <= h) {
            if (((a[v] % 2) == 0) && !((a[h] % 2) == 0)) {
                bytt(a, v++, h--);
            } else if ((a[v] % 2) == 0) {
                h--;
            } else if (!((a[h] % 2) == 0)) {
                v++;
            } else if (!((a[v] % 2) == 0) && ((a[h] % 2) == 0)) {
                v++;
                h--;
            }
        }
        kvikksortering(a,0,v);
        kvikksortering(a,v,lengde);

    }
    /**
     * oppgave 5
     */
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
     * oppgave 6
     */

    public static int gcd(int a, int b)
    {
        return b == 0 ? a : gcd(b, a % b);
    }




    public static void rotasjon(char[] a, int d1){
        int n = a.length;  if (n < 2) return;
        if ((d1 %= n) < 0){
            d1 += n;
        }

        int s = gcd(n, d1);

        for (int m = 0; m < s; m++)
        {
            char flytt = a[m];

            for (int i = m - d1, l = m; i != m; i -= d1) {
                if (i < 0) {
                    i += n;
                }
                a[l] = a[i]; l = i;
            }
            a[m + d1] = flytt;
        }
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

    /**
     * Oppgave 8
     * @param a
     * @return
     */

    public static int[] indekssortering(int[] a) {
        int[] indeks = new int[a.length];
        int[] temp = new int[a.length];

        if (a.length == 0) return indeks;
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }

        boblesortering(temp);


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (temp[i] == a[j]) {
                    indeks[i] = j;
                }
            }
        }
        return indeks;
    }
    private static void kvikksortering0(int[] a, int v, int h)  // en privat metode
    {
        if (v >= h) return;  // a[v:h] er tomt eller har maks ett element
        int k = sParter0(a, v, h, (v + h)/2);  // bruker midtverdien
        kvikksortering0(a, v, k - 1);     // sorterer intervallet a[v:k-1]
        kvikksortering0(a, k + 1, h);     // sorterer intervallet a[k+1:h]
    }


    private static int sParter0(int[] a, int v, int h, int indeks)
    {
        bytt(a, indeks, h);           // skilleverdi a[indeks] flyttes bakerst
        int pos = parter0(a, v, h - 1, a[h]);  // partisjonerer a[v:h − 1]
        bytt(a, pos, h);              // bytter for å få skilleverdien på rett plass
        return pos;                   // returnerer posisjonen til skilleverdien
    }

    private static int parter0(int[] a, int v, int h, int skilleverdi)
    {
        while (true)                                  // stopper når v > h
        {
            while (v <= h && a[v] < skilleverdi) v++;   // h er stoppverdi for v
            while (v <= h && a[h] >= skilleverdi) h--;  // v er stoppverdi for h

            if (v < h) bytt(a,v++,h--);                 // bytter om a[v] og a[h]
            else  return v;  // a[v] er nåden første som ikke er mindre enn skilleverdi
        }
    }

    public static void kvikksortering(int[] a, int fra, int til) // a[fra:til>
    {
        kvikksortering0(a, fra, til - 1);  // v = fra, h = til - 1
    }

    public static void kvikksortering(int[] a)   // sorterer hele tabellen
    {
        kvikksortering0(a, 0, a.length - 1);
    }
    public static void bytt(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void bytt(char[] c, int i, int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
    public static void boblesortering(int[] a)     // hører til klassen Tabell
    {
        for (int n = a.length; n > 1; n--)           // n reduseres med 1 hver gang
        {
            for (int i = 1; i < n; i++)                // går fra 1 til n
            {
                if (a[i - 1] > a[i]) bytt(a, i - 1, i);  // sammenligner/bytter
            }
        }
    }

    /**
     * Oppgave 9
     */

    public static int[] tredjeMin(int[] a) {

        int n = a.length;
        if(n < 3){
            throw new NoSuchElementException("a.length(" + n + ") < 3!");
        }

        if (n <= 3) {
            int[] indeks1 = new int[3];
            int[] temp1 = new int[n];

            for (int i = 0; i < n; i++) {
                temp1[i] = a[i];
            }

            boblesortering(temp1);

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < n; j++) {
                    if (temp1[i] == a[j]) {
                        indeks1[i] = j;
                    }
                }
            }
            return indeks1;

        } else if (n > 3 && n <= 6) {

            int[] indeks2 = new int[6];
            int[] temp2 = new int[6];

            for (int i = 0; i < 6; i++) {
                temp2[i] = a[i];
            }

            boblesortering(temp2);

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < n; j++) {
                    if (temp2[i] == a[j]) {
                        indeks2[i] = j;
                    }
                }
            }
            return indeks2;

        } else {

            int[] indeks3 = new int[10];
            int[] temp3 = new int[10];

            for (int i = 0; i < 10; i++) {
                temp3[i] = a[i];
            }

            boblesortering(temp3);

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < n; j++) {
                    if (temp3[i] == a[j]) {
                        indeks3[i] = j;
                    }
                }
            }
            return indeks3;
        }
    }

    /**
     * Oppgave 10
     */
    public static boolean inneholdt(String a, String b) {

        char[] A = a.toCharArray();
        char[] B = b.toCharArray();

        quickSort(A, 0, A.length - 1);
        quickSort(B, 0, B.length - 1);

        return inklusjon(A, B);
    }


    public static boolean inklusjon(char[] a, char[] b, int c, int d) {

        int i = 0;                                       // indekser
        int j = 0;

        while (i < c && j < d) {                         // Itererer gjennom begge arrayene.
            if (a[i] > b[j])                             // Hvis a[i] > b[j] hopper vi til neste element i tabell b
                j++;
            else if (a[i] == b[j]) {                     // Hvis a[i] == b[j] hopper vi til neste element i
                i++;                                     // begge tabellene
                j++;
            } else if (a[i] < b[j]) {                    // Hvis a[i] < b[j], returner false
                return false;
            }
        }

        if(i < c) {                                      // Hvis indeksen til tabell a mindre enn lengden på tabell a,
            return false;                                // returner false
        } else
            return true;                                 // ellers, return true

    }

    public static boolean inklusjon(char[] a, char[] b) {

        return inklusjon(a, b, a.length, b.length);
    }

    public static void quickSort(char[] tab, int low, int high) {

        if (tab == null || tab.length == 0)        // Hopp ut av metoden hvis tabellen ikke
            return;                                // eksisterer eller hvis lengden til tabellen er lik 0.

        if (low >= high)                           // Hopp ut av metoden hvis det minste elementet er mindre
            return;                                // eller lik det største elementet

        int middle = low + (high - low) / 2;       // Velger midterste indeks som "pivot"
        int pivot = tab[middle];

        int i = low, j = high;
        while (i <= j) {
            while (tab[i] < pivot) {               // Elementer som er mindre enn pivot plasseres på venstre side av pivot
                i++;
            }

            while (tab[j] > pivot) {               // Elementer som er større enn pivot plasseres på høyre side av pivot
                j--;
            }

            if (i <= j) {                          // Partisjonerer. Hvis elementen er lavere eller lik pivot
                char temp = tab[i];                // blir den plass med det elementet som ligger lengst til venstre
                tab[i] = tab[j];                   // som er større enn pivot
                tab[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)                               // Sorterer sub delene rekursivt
            quickSort(tab, low, j);

        if (high > i)
            quickSort(tab, i, high);
    }
}
