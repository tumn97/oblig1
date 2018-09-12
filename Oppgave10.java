public class Oppgave10 {


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
