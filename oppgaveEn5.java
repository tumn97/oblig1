package Algoritme.oblig;

import java.util.Arrays;

public class oppgaveEn5 {

    public static void main(String[] args){
        char[] array = {'a','b','c','d','e','f','g','h','i','j'};


            rotasjon(array);
        System.out.println(Arrays.toString(array));

    }
    public static void rotasjon(char[] a){
        //indeks
        int indeks = 0;
        //lengden på arrayet
        int n = a.length-1;
        //itererer så lang arrayen a er.
        for(int i = 0; i < a.length-1; i++){
            //flytter på verdiene i arrayet
            char flytt = a[n];
            a[n] = a[indeks];
            a[indeks]  = flytt;
            //øker indeks med 1.
            //sånn at den første plassen ikke
            //blir forstyrret.
            indeks++;
    //hjk

        }
            System.out.println("test");
    }

}
