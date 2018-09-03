package Algoritme.oblig;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class oblig1 {
    public static void main(String[] args){
        int[] test1= null;
        int [] test = {1,3,2,3,5,4,7,4,6,9,8};
        System.out.println(Arrays.toString(test));
            maks(test);
            System.out.println(Arrays.toString(test));

    }
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

            return m;
    }
}
