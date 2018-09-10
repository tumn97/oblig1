    // Oppgave 6

    public static void rotasjon(char[] a, int k) {

        int indeks = 0;

        int n = a.length-1;

        if(k == 1) {

            for (int i = 0; i < n; i++) {

                char flytt = a[n];
                a[n] = a[indeks];
                a[indeks] = flytt;
                indeks++;
            }

        } else if (k < 0) {

            for (int i = a.length; i > 1; i--) {

                char flytt = a[n];
                a[n] = a[indeks];
                a[indeks] = flytt;
                indeks++;
            }

        } else if (k > a.length) {

            for (int i = 0; i < n; i++) {

                char flytt = a[n];
                a[n] = a[indeks];
                a[indeks] = flytt;
                indeks++;
            }
        }
    }


    // Oppgave 9
    public static int[] tredjeMin(int[] a) {

        int n = a.length;

        if (n < 3) {
            throw new NoSuchElementException("a.length(" + n + ") < 3!");
        }

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;

        int m1 = 0;
        int m2 = 0;
        int m3 = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] < min1) {

                min3 = min2;
                min2 = min1;
                min1 = a[i];
                m1 = i;

            } else if (a[i] < min2) {

                min3 = min2;
                min2 = a[i];
                m2 = i;

            } else if (a[i] < min3) {

                min3 = a[i];
                m3 = i;
            }
        }

        int[] index = {m1, m2, m3};

        return index;
    }
