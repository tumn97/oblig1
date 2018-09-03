import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

    public static int[] tredjeMin(int[] a) {

        int n = a.length;

        if (n < 3) {
            throw new IllegalArgumentException("a.length(" + n + ") < 3!");
        }

        int mv0 = 0;     //posisjonen til minste verdi
        int mv1 = 1;     //posisjonen til nest minste verdi
        int mv2 = 2;     //posisjonen til tredje nest minste verdi

        int minVerdi = a[mv0];
        int nestMinVerdi = a[mv1];
        int tredjeMinVerdi = a[mv2];

        for(int i = 1; i < n; i++) {
            if (a[i] == minVerdi) {
                mv0 = i;
                minVerdi = mv0;         //Minste verdi oppdateres
            }
            if (a[i] == nestMinVerdi) {
                mv1 = i;
                nestMinVerdi = mv1;     //Nest minste verdi oppdateters
            }
            if (a[i] == tredjeMinVerdi) {
                mv2 = i;
                tredjeMinVerdi = mv2;   //Tredje nest minste verdi oppdateres
            }
        }

        return new int[] {
         mv0,
         mv1,
         mv2};
    }

}



