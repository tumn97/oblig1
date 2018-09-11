package Algoritme.oblig1;

import Algoritme.oblig.Oblig1;

import java.util.NoSuchElementException;

public class Oppgave9 {
    public static int[] tredjeMin(int[] a){
        //initialiserer n som tabellens lengde
        Oblig1.indekssortering(a);
        int n = a.length;
        if(n < 3){
            throw new NoSuchElementException("Tabellen inneholder mindre enn 3 verdier");
        }

        //initialiserer posisjonene til minste, nest minste og tredje minste verdi
        int m1 = 0;
        int m2= 1;
        int m3 = 2;
        if(a.length == 3){
            return new int[] {m1,m2,m3};
        }

//            System.out.println(a[m1]);
//            System.out.println(a[m2]);
//            System.out.println(a[m3]);



        //hvis den nest minste er større enn den minste. bytt
        if(a[1] < a[0]){
            m2 = 0;
            m1 = 1;
        }
        //hvis den tredj minste er mindre enn a[0] bytt
        if(a[2] < a[0]){
            m3 = 0;
            m1 = 2;
        }
        if(a[1] < a[2]){
            m1= 2;
            m3= 1;
        }
        //minste verdi
        int minstverdi = a[m1];
        int nestminst = a[m2];
        int nestNestminst= a[m3];

        for(int i = 3; i < n; i++){

            if(a[i] < nestNestminst){

                m3 = i;
                nestNestminst = a[i];

                if(a[i] <= nestminst){

                    m3= m2;
                    nestNestminst = nestminst;

                    m2 = i;
                    nestminst = a[i];
                    if(a[i] < minstverdi){
                        m2 = m1;
                        nestminst = minstverdi;

                        m1 = i;
                        minstverdi = a[i];

                    }
                }else{
                    m2 = i;
                    nestminst=a[i];
                }
            }

        }
        return new int[] {m1,m2,m3};
    }
}
