package nyugtaprojektek;

/* Probléma:
tüntessük el a kézzel beírt szóközöket,
a huf ne tartalmazzon eurót
a kedvezmény helyett legyen szervízdíj, amit hozzá kell adni a végössdzeghez
 */
public class Nyugta3 {

    public static void main(String[] args) {
        
        final String HUF = "Ft";
        final String eur = "\u20ac";
        int tetel1 = 350, tetel2 = 90, tetel3 = 1320;
        int osszesen = tetel1 + tetel2 + tetel3;
        int szervizDijMertek = 10;
        
        String csillagok = "********************";
        String duplaVonal = "====================";
        String szaggatottVonal = "--------------------";
        String rovidVonal = "_______";
        
        System.out.println(csillagok);
        System.out.printf("%14s\n", "Nyugta 3");
        System.out.println(csillagok);

        System.out.printf("%10s:%6d%3s\n", "Tétel 1", tetel1, HUF);
        System.out.printf("%10s:%6d%3s\n", "Tétel 2", tetel2, HUF);
        System.out.printf("%10s:%6d%3s\n", "Tétel 3", tetel3, HUF);

        System.out.println(duplaVonal);
        System.out.printf("%10s:%6d%3s\n", "Összesen", osszesen, HUF);
        System.out.println(szaggatottVonal);

        int szervizDij = osszesen / szervizDijMertek;
        System.out.printf("%10s:%6d%3s\n", "Szervízdíj", szervizDij, HUF);
        System.out.printf("(%d%%)\n", szervizDijMertek);
        System.out.println(duplaVonal);

        int fizetendo = osszesen + szervizDij;
        System.out.printf("%10s:%6d%3s\n", "Fizetendő", fizetendo, HUF);
        
        double euro = fizetendo / 350.0;
        System.out.printf("%10s%7.2f%2s\n", "", euro, eur);//
        System.out.println(szaggatottVonal + "\n");

        System.out.print(rovidVonal);
        System.out.printf("%13s\n", rovidVonal);

        System.out.printf("%6s", "Dátum");
        System.out.printf("%12s\n", "Név");

        System.out.println(csillagok);
        System.out.printf("%11s\n", "CÉG");
        System.out.println(csillagok);
    }

}
