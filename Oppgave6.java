package Algoritme.oblig1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Oppgave6 {
    public static void main(String[] args) {
        //Oblig1Test.oppgave6();
       char[] b =  {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        char[] d = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

        char[] d1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

        char[] d0 = {'G', 'H', 'I', 'J', 'A', 'B', 'C', 'D', 'E', 'F'};

        rotasjon(d, 4);
        rotasjon(d1,-6);
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(d1));




    }

    public static void rotasjon(char[] a, int k) {


        if (k > 0) {
            venstreRotasjon(a, k);

        }else if(Math.abs(k) > 0){
            hoyreRotasjon(a, k);

        }else if (k == 0){
            k = 1;
            venstreRotasjon(a,k);
        }
        }

    public static void venstreRotasjon(char[] a, int k) {

        char temp;
        for (int i = 0; i < Math.abs(k); i++) {
            temp = a[0];
            for (int j = 0; j < a.length - 1; j++) {
                a[j] = a[j + 1];
            }
            a[a.length - 1] = temp;
        }

    }

    public static void hoyreRotasjon(char[] a, int k) {
        char temp;
        int n = a.length-1;

        for (int i = 0; i < Math.abs(k); i++) {
            temp = a[n];

            for (int j = n ; j > 0; j--) {
               // a[n] = a[indeks];
                a[j] = a[j-1];
            }
            a[0]=temp;
        }
    }
}
