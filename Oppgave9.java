public class Oppgave9 {

    public static int[] tredjeMin(int[] a) {

        int n = a.length;

        if (n < 3) {
            throw new NoSuchElementException("a.length(" + n + ") < 3!");
        }

        int min1 = a[0];
        int min2 = a[0];
        int min3 = a[0];

        int m1 = 0;
        int m2 = 0;
        int m3 = 0;

        for (int i = 0; i < a.length; i++) {

            if (min1 > a[i]) {

                min2 = min1;
                min1 = a[i];
                m1 = i;

            } else if (min2 > a[i]) {

                min2 = a[i];
                m2 = i;

            } else if (min3 > a[i] && min2 < a[i]) {

                min3 = a[i];
                m3 = i;
            }
        }

        int index[] = {m1, m2, m3};

        return index;
    }
}
