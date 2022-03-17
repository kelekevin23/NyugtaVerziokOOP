package nyugtaprojektek;
public class Nyugta4 {

    public static void main(String[] args) {
        csillagok();
        System.out.printf("%14s\n", "Nyugta 4");
        csillagok();
        
        final String HUF = "Ft";
        int tetelek[] = {350, 90, 1320};
        int tetelDb = tetelek.length;
        for (int i = 0; i < tetelDb; i++) {
            System.out.printf("%10s: %5d %s\n", "Tétel 1", tetelek[i], HUF);
        }

        //String duplaVonal = "====================";
        //System.out.println(duplaVonal);
        duplaVonal();
        
        //összegzés tétele:
        int osszesen = 0;
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
        
        //System.out.println(duplaVonal);
        duplaVonal();

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
  
        csillagok();
        System.out.println("        CÉG");
        csillagok();
    }

    private static void csillagok() {
        String csillagok = "";
        
        //összegzés tétele:
        for (int i = 0; i < 20; i++) {
            csillagok += "*";
        }
        
        System.out.println(csillagok);
    }

    private static void duplaVonal() {
        String vonal = "";
        
        //összegzés tétele:
        for (int i = 0; i < 20; i++) {
            vonal += "=";
        }
        
        System.out.println(vonal);
    }

}
