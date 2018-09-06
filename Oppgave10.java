public class Oppgave10 {


    /*
    Metoden fungerer ikke som den skal fordi
    boolean match utgir true eller false kun ut i fra
    siste sammenligning. Altså de sammenligningene
    som blir gjort tidligere spiller ingen rolle.
     */

    public static boolean inneholdt(String a, String b) {

        char m;
        char n;
        boolean match = true;
        //ArrayList<Boolean> matching = new ArrayList<>();

        for (int i = 0; i < a.length(); i++) {
            m = a.charAt(i);
            for (int j = 0; j < b.length(); j++) {
                n = b.charAt(j);
                if(m != n) {
                    match = false;
                    //matching.add(false);
                    System.out.println(m + " " + n);
                } else {
                    match = true;
                    //matching.add(true);
                    System.out.println(m + " " + n);
                }
            }
        }


        return match;
    }
}
