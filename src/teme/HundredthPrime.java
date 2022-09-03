package teme;

public class HundredthPrime {
    public static void main(String[] args) {
        /* Complete the code. */
        int numar;
        int contor = 100;

        numar = getNumarPrim(contor);
        System.out.println(numar); // incrementasem ca sa caut mai departe
    }

    private static int getNumarPrim(int contor) {
        boolean gata = false;
        int numar = 3; // incep dupa 1,2,3
        int divizor = 2; // incep sirul divizorilor cu 2
        int k = 3; // am numarat 3 numere prime (1,2,3)
        do {
            numar = numar + 1;
            while (divizor <= (numar / 2)) {
                //daca se imparte exact, trec la nr urmator
                if (((numar / divizor) * divizor) == numar) {
                    numar = numar + 1;
                    divizor = 2; //next no
                } else {
                    // daca nu se imparte exact, trec la divizorul urmator
                    divizor = divizor + 1; // next div
                }
            }
            // ies din bucla cu un numar prim
            k = k + 1; // contorizez numarul prim
            System.out.println(k + " " + numar);
            // trec la nr urmator, cautand urmatorul nr prim
            if (k >= contor) {
                gata = true;
            }
        }
        while (!gata); // caut pana la al 100-lea nr prim
        return numar;
    }
}

