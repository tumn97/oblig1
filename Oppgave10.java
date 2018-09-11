import java.util.Arrays;

public class Oppgave10 {


    public static boolean inneholdt(String a, String b) {

        char[] A = a.toCharArray();
        char[] B = b.toCharArray();
        Arrays.sort(A);
        Arrays.sort(B);

        int i = 0;
        int j = 0;

        while (i < a.length() && j < b.length()) {
            if (A[i] < B[j])
                i++;
            else if (A[i] == B[j]) {
                i++;
                j++;
            } else return false;
        }
        return true;

    }
}
