public class Uke34 {

    public static void main(String[] args) {
//        System.out.println("Hei AlgDat!");
//
//        System.out.println("Teller til ti");
//        for (int i = 1; i <= 10; i++){
//            System.out.println(i);
//        }
//
//        System.out.println("Petra teller til tjue");
//        for (int i = 11; i <= 20; i++){
//            System.out.println(i);
//        }

        // Maksverdimetoden
//        int[] valg = {16, 3, 8, 19, 22, 7, 26};
//
//        int maksVerdi = valg[0];
//
//        for (int i = 1; i < valg.length; i++) {
//            int verdi = valg[i];
//            {
//                if (verdi > maksVerdi) {
//                    maksVerdi = verdi;
//                }
//            }
//        }
//        System.out.println(maksVerdi);

        // Minverdimetoden
//        int minVerdi = valg[0];
//        for (int i = 1; i < valg.length; i++) {
//            int verdi = valg[i];
//            {
//                if (verdi > minVerdi) {
//                    minVerdi = verdi;
//                }
//            }
//        }
//        System.out.println(minVerdi);


        // Oppgaver 1.1.2
        int[] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19, 20};
    /*
    1.	Anta at vi har en min-metode, dvs. en metode som finner (og returnerer) posisjonen til den minste verdien
        i en tabell. Hva ville metodekallet min(a) returnere med hvis a er tabellen i Figur 1.1.2?
        Svar:
        min(a) ville returnert 6

    2.	Lag en min-metode på samme måte som maks-metoden i Programkode 1.1.2, dvs. en metode som finner (og returnerer)
        posisjonen til den minste verdien i en tabell.
    3.	Hvis den største verdien forekommer flere ganger, vil maks-metoden returnere posisjonen til den første av dem.
        Hva må endres for at den skal returnere posisjonen til den siste?
     */

        // Oppg2: minPosisjonsMetode:
//        int posisjon = 0;
//        int minsteVerdi = a[0];
//        for (int i = 1; i < a.length; i++){
//            int verdi = a[i];
//            if(verdi < minsteVerdi) {
//                minsteVerdi = verdi;
//                posisjon = i;
//            }
//        }
//        System.out.println(posisjon);


    // Oppg3: maksPosisjonsMetode returnerer siste index
//        int maksimumVerdi = a[0];
//        for (int i = 1; i < a.length; i++){
//            int verdi = a[i];
//            if(verdi >= maksimumVerdi){
//                maksimumVerdi = verdi;
//                posisjon = i;
//            }
//        }
//        System.out.println(posisjon);

        int minIndex = min(a);

        System.out.println(minIndex);
        System.out.println(a[minIndex]);


    }

    // Oppg2: Static method!
    static int min(int[] a) {
        // Initialiserer med første element
        // Initialiserer en index variabel som lagrer index
        int posisjon = 0;
        int minsteVerdi = a[0];

        // Looper over alle resterende elementer og finner et mindre tall.
        for (int i = 1; i < a.length; i++){
            int verdi = a[i];
            if(verdi < minsteVerdi) {
                // Lagrer index hvis verdi er mindre enn minsteVerdi
                minsteVerdi = verdi;

                posisjon = i;
            }
        }
        // Returnerer indexen til minste verdi i arrayet.
        return posisjon;

    }

}
