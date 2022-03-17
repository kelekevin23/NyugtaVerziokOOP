package nyugtaprojektek;
public class Nyugta4 {

    public static void main(String[] args) {
        vonal('*', 20);
        System.out.printf("%14s\n", "Nyugta 4");
        vonal('*', 20);
        
        final String HUF = "Ft";
        int tetelek[] = {350, 90, 1320};
        int tetelDb = tetelek.length;
        for (int i = 0; i < tetelDb; i++) {
            System.out.printf("%10s: %5d %s\n", "Tétel 1", tetelek[i], HUF);
        }

        vonal('=', 20);
        
        //összegzés tétele:
        int osszesen = 0;
        for (int i = 0; i < tetelDb; i++) {
            osszesen += tetelek[i];
        }
        System.out.printf("%10s: %5d %s\n", "Összesen", osszesen, HUF);
        
        //String szaggatottVonal = "--------------------";
        //System.out.println(szaggatottVonal);
        vonal('-', 20);
        
        int szervizDijMertek = 10;
        int szervizDij = osszesen / szervizDijMertek;
        System.out.printf("%10s: %5d %s\n", "Szervízdíj", szervizDij, HUF);
        System.out.printf("(%d%%)\n", szervizDijMertek);
        
        vonal('=', 20);

        int fizetendo = osszesen + szervizDij;
        System.out.printf("%10s:  %d %s\n", "Fizetendő", fizetendo, HUF);
        double euro = fizetendo / 350.0;
        final String eur = "\u20ac";
        
        System.out.printf("%10s%7.2f %s\n","", euro, eur);//
        
        vonal('-', 20);
        
        System.out.println("");
        //rovidVonal();
        vonal('_', 7);
        String rovidVonalValaszto = "      ";
        System.out.print(rovidVonalValaszto);
        //rovidVonal();
        vonal('_',7);
        System.out.println("");
        System.out.print(" Dátum");
        System.out.print(rovidVonalValaszto);
        System.out.println("   Név");
  
        vonal('*', 20);
        System.out.println("        CÉG");
        vonal('*', 20);
    }

    private static void vonal(char jel, int hossz) {
        String vonal = "";
        
        //összegzés tétele:
        for (int i = 0; i < hossz; i++) {
            //vonal += "*";
            vonal += jel;
        }
        
        System.out.println(vonal);
    }

//    private static void rovidVonal() {
//        String vonal = "";
//        
//        //összegzés tétele:
//        for (int i = 0; i < 7; i++) {
//            //vonal += "*";
//            vonal += '_';
//        }
//        
//        System.out.print(vonal);
//    }
}
