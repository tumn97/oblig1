package Algoritme.oblig;

public class oppgaveEn5 {

    public static void rotasjon(char[] a){
        int indeks = 0;
        int n = a.length;
        for(int i = 0; i < a.length-1; i++){

            char flytt = a[n];
            a[n] = a[indeks];
            a[indeks]  = flytt;
            indeks++;
    //hjk

        }

    }

}
