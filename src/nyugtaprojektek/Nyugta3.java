package nyugtaprojektek;

/* Probléma:
tüntessük el a kézzel beírt szóközöket,
a huf ne tartalmazzon eurót
a kedvezmény helyett legyen szervízdíj, amit hozzá kell adni a végössdzeghez
 */
public class Nyugta3 {

    public static void main(String[] args) {
        String csillagok = "********************";
        System.out.println(csillagok);
        //System.out.println("     Nyugta 3");
        System.out.printf("%14s\n", "Nyugta 3");
        System.out.println(csillagok);

        final String HUF = "Ft";
        int tetel1 = 350, tetel2 = 90, tetel3 = 1320;
//        System.out.printf("Tétel 1:     %d %s\n", tetel1, huf);
//        System.out.printf("Tétel 1:      %d %s\n", tetel2, huf);
//        System.out.printf("Tétel 3:    %d %s\n", tetel3, huf);
        System.out.printf("%10s: %5d %s\n", "Tétel 1", tetel1, HUF);
        System.out.printf("%10s: %5d %s\n", "Tétel 2", tetel2, HUF);
        System.out.printf("%10s: %5d %s\n", "Tétel 3", tetel3, HUF);

        String duplaVonal = "====================";
        System.out.println(duplaVonal);

        int osszesen = tetel1 + tetel2 + tetel3;
        //System.out.printf("Összesen:   %d %s\n", osszesen, huf);
        System.out.printf("%10s: %5d %s\n", "Összesen", osszesen, HUF);

        String szaggatottVonal = "--------------------";
        System.out.println(szaggatottVonal);

        int szervizDijMertek = 10;
        int szervizDij = osszesen / szervizDijMertek;
        //System.out.printf("Kedvezmény:  %d %s\n", kedvezmeny, huf);
        System.out.printf("%10s: %5d %s\n", "Szervízdíj", szervizDij, HUF);
        System.out.printf("(%d%%)\n", szervizDijMertek);

        System.out.println(duplaVonal);

        //int fizetendo = osszesen - szervizDij;
        int fizetendo = osszesen + szervizDij;
        //System.out.printf("Fizetendő:  %d %s\n", fizetendo, huf);
        System.out.printf("%10s:  %d %s\n", "Fizetendő", fizetendo, HUF);
        double euro = fizetendo / 350.0;
        //HUF = "\u20ac";//EZ NEM JÓ!!!!
        final String eur = "\u20ac";
        //System.out.printf("            %f %s\n", euro, eur);

        /* 7.2 7 szélesen 2 tizedessel,a max: 1234.99
        *  a %10s  egy "" -t ír ki, ezzel tolom beljebb
         */
        System.out.printf("%10s%7.2f %s\n", "", euro, eur);//

        String rovidVonal = "_______";
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
