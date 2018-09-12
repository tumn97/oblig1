package Algoritme.oblig1;

import Algoritme.oblig.Oblig1;

import java.util.NoSuchElementException;

    // Oppgave 9 (unfinished)
    public static int[] tredjeMin(int[] a) {

        int n = a.length;
        if (n < 3){
            throw new NoSuchElementException("a.length(" + n + ") < 3!");
        }

        int m1 = 0;
        int m2 = 1;
        int m3 = 2;

        if(a.length == 3){
            return new int[] {m1, m2, m3};
        }

        if(a[1] < a[0]){
            m2 = 0;
            m1 = 1;
        }

        if(a[2] < a[0]){
            m3 = 0;
            m1 = 2;
        }

        if(a[1] < a[2]){
            m1 = 2;
            m3 = 1;
        }

        int min1 = a[m1];
        int min2 = a[m2];
        int min3= a[m3];

        for (int i = 3; i < n; i++){

            if (a[i] < min3){

                m3 = i;
                min3 = a[i];

                if (a[i] <= min2){

                    m3= m2;
                    min3 = min2;

                    m2 = i;
                    min2 = a[i];

                    if (a[i] < min1){
                        m2 = m1;
                        min2 = min1;

                        m1 = i;
                        min1 = a[i];

                    }
                } else {

                    m2 = i;
                    min2=a[i];
                }
            }

        }

        int indeks[] = {m1, m2, m3};
        return indeks;
    }
