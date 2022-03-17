package nyugtaprojektek;
public class Nyugta4 {

    public static void main(String[] args) {
        String csillagok = "********************";
        System.out.println(csillagok);
        System.out.printf("%14s\n", "Nyugta 4");
        System.out.println(csillagok);
        
        final String HUF = "Ft";
//        int tetel1 = 350, tetel2 = 90, tetel3 = 1320;
//        System.out.printf("%10s: %5d %s\n", "Tétel 1", tetel1, HUF);
//        System.out.printf("%10s: %5d %s\n", "Tétel 2", tetel2, HUF);
//        System.out.printf("%10s: %5d %s\n", "Tétel 3", tetel3, HUF);
        int tetelek[] = {350, 90, 1320};
        int tetelDb = tetelek.length;
        for (int i = 0; i < tetelDb; i++) {
            System.out.printf("%10s: %5d %s\n", "Tétel 1", tetelek[i], HUF);
        }

        String duplaVonal = "====================";
        System.out.println(duplaVonal);
        
        //összegzés tétele:
        int osszesen = 0; //tetel1 + tetel2 + tetel3;
        for (int i = 0; i < tetelDb; i++) {
            osszesen += tetelek[i];
        }
        System.out.printf("%10s: %5d %s\n", "Összesen", osszesen, HUF);
        
        String szaggatottVonal = "--------------------";
        System.out.println(szaggatottVonal);
        
        int szervizDijMertek = 10;
        int szervizDij = osszesen / szervizDijMertek;
        System.out.printf("%10s: %5d %s\n", "Szervízdíj", szervizDij, HUF);
        System.out.printf("(%d%%)\n", szervizDijMertek);
        
        System.out.println(duplaVonal);

        int fizetendo = osszesen + szervizDij;
        System.out.printf("%10s:  %d %s\n", "Fizetendő", fizetendo, HUF);
        double euro = fizetendo / 350.0;
        final String eur = "\u20ac";
        
        System.out.printf("%10s%7.2f %s\n","", euro, eur);//
        
        System.out.println(szaggatottVonal);
        
        System.out.println("");
        String rovidVonal = "_______";
        System.out.print(rovidVonal);
        String rovidVonalValaszto = "      ";
        System.out.print(rovidVonalValaszto);
        System.out.println(rovidVonal);
        System.out.print(" Dátum");
        System.out.print(rovidVonalValaszto);
        System.out.println("   Név");
        
        System.out.println(csillagok);    
        System.out.println("        CÉG");
        System.out.println(csillagok);
    }

}
