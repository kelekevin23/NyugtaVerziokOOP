package nyugtaprojektek;
public class Nyugta4 {

    public static void main(String[] args) {
        fejlec();
        
        final String HUF = "Ft";
        int tetelek[] = {350, 90, 1320};
        int tetelDb = tetelek.length;
        for (int i = 0; i < tetelDb; i++) {
            System.out.printf("%10s: %5d %s\n", "Tétel 1", tetelek[i], HUF);
        }

        vonal('=', 20, true);
        
        //összegzés tétele:
        int osszesen = 0;
        for (int i = 0; i < tetelDb; i++) {
            osszesen += tetelek[i];
        }
        System.out.printf("%10s: %5d %s\n", "Összesen", osszesen, HUF);
       
        vonal('-', 20, true);
        
        int szervizDijMertek = 10;
        int szervizDij = osszesen / szervizDijMertek;
        System.out.printf("%10s: %5d %s\n", "Szervízdíj", szervizDij, HUF);
        System.out.printf("(%d%%)\n", szervizDijMertek);
        
        vonal('=', 20, true);

        int fizetendo = osszesen + szervizDij;
        System.out.printf("%10s:  %d %s\n", "Fizetendő", fizetendo, HUF);
        double euro = fizetendo / 350.0;
        final String eur = "\u20ac";
        
        System.out.printf("%10s%7.2f %s\n","", euro, eur);//
        
        vonal('-', 20, true);
        
        System.out.println("");
        vonal('_', 7, false);
        vonal(' ', 6, false);
        vonal('_',7, true);
        System.out.print(" Dátum");
        vonal(' ', 6, false);
        System.out.println("   Név");
  
        vonal('*', 20, true);
        System.out.println("        CÉG");
        vonal('*', 20, true);
    }

    private static void fejlec() {
        vonal('*', 20, true);
        System.out.printf("%14s\n", "Nyugta 4");
        vonal('*', 20, true);
    }

    private static void vonal(char jel, int hossz, boolean sortores) {
        String vonal = "";
        
        //összegzés tétele:
        for (int i = 0; i < hossz; i++) {
            //vonal += "*";
            vonal += jel;
        }
        
        //System.out.println(vonal);
        System.out.print(vonal);
        
        if(sortores){
            System.out.println("");
        }
    }
}
