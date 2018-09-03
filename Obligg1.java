import java.util.ArrayList;

public class Obligg1 {

    /**
     * Oppgave 3,
     * @param a
     * @return
     */
    public static int antallUlikeSortert(int[] a) {
        if (a.length == 0) {
            return 0;
        }

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                throw new IllegalStateException("Arrayet er ikke sortert i stigende rekkefølge");
            }
        }

        int antallUlike = 1;

        for (int j = 0; j<a.length - 1; j++) {
            if (a[j] != a[j + 1]){
                ++antallUlike;
            }
        }


        return antallUlike;
    }


}
