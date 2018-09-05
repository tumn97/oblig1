package Algoritme.oblig;

import Algoritme.Hjelpeklasse.Tabell;

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
