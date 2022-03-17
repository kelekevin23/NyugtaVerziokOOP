package nyugtaprojektek;
public class Nyugta4 {

    public static void main(String[] args) {
        vonal('*');
        System.out.printf("%14s\n", "Nyugta 4");
        vonal('*');
        
        final String HUF = "Ft";
        int tetelek[] = {350, 90, 1320};
        int tetelDb = tetelek.length;
        for (int i = 0; i < tetelDb; i++) {
            System.out.printf("%10s: %5d %s\n", "Tétel 1", tetelek[i], HUF);
        }

        vonal('=');
        
        //összegzés tétele:
        int osszesen = 0;
        for (int i = 0; i < tetelDb; i++) {
            osszesen += tetelek[i];
        }
        System.out.printf("%10s: %5d %s\n", "Összesen", osszesen, HUF);
        
        //String szaggatottVonal = "--------------------";
        //System.out.println(szaggatottVonal);
        vonal('-');
        
        int szervizDijMertek = 10;
        int szervizDij = osszesen / szervizDijMertek;
        System.out.printf("%10s: %5d %s\n", "Szervízdíj", szervizDij, HUF);
        System.out.printf("(%d%%)\n", szervizDijMertek);
        
        vonal('=');

        int fizetendo = osszesen + szervizDij;
        System.out.printf("%10s:  %d %s\n", "Fizetendő", fizetendo, HUF);
        double euro = fizetendo / 350.0;
        final String eur = "\u20ac";
        
        System.out.printf("%10s%7.2f %s\n","", euro, eur);//
        
        //System.out.println(szaggatottVonal);
        vonal('-');
        
        System.out.println("");
        String rovidVonal = "_______";
        System.out.print(rovidVonal);
        String rovidVonalValaszto = "      ";
        System.out.print(rovidVonalValaszto);
        System.out.println(rovidVonal);
        System.out.print(" Dátum");
        System.out.print(rovidVonalValaszto);
        System.out.println("   Név");
  
        vonal('*');
        System.out.println("        CÉG");
        vonal('*');
    }

    private static void vonal(char jel) {
        String vonal = "";
        
        //összegzés tétele:
        for (int i = 0; i < 20; i++) {
            //vonal += "*";
            vonal += jel;
        }
        
        System.out.println(vonal);
    }
}
