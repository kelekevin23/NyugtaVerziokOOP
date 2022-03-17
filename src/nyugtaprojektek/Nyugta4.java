package nyugtaprojektek;
public class Nyugta4 {

    //több metódusnak is látnia kell:
    static final String HUF = "Ft";
    static int tetelek[] = {350, 90, 1320};
    static int tetelDb = tetelek.length;
    
    public static void main(String[] args) {
        fejlec();
        tetelekKiirasa();
        
        vonal('=', 20, true);
        
        int osszesen = osszesFogyasztas();
        //System.out.printf("%10s: %5d %s\n", "Összesen", osszesen, HUF);
        erteketKiir("Összesen", osszesFogyasztas());
        
        vonal('-', 20, true);
        
        int szervizDijMertek = 10;
        int szervizDij = szervizDijErteke(szervizDijMertek);
        //System.out.printf("%10s: %5d %s\n", "Szervízdíj", szervizDij, HUF);
        erteketKiir("Szervízdíj", szervizDijErteke(szervizDijMertek));
        System.out.printf("(%d%%)\n", szervizDijMertek);
        
        vonal('=', 20, true);

        int fizetendo = osszesen + szervizDij;
        //System.out.printf("%10s:  %d %s\n", "Fizetendő", fizetendo, HUF);
        erteketKiir("Fizetendő", fizetendo);
        
        double euro = fizetendo / 350.0;
        final String eur = "\u20ac";
        
        System.out.printf("%10s%7.2f %s\n","", euro, eur);//
        
        vonal('-', 20, true);
        
        datumEsNevKiirasa();
  
        vonal('*', 20, true);
        
        lablec();
    }

    private static void lablec() {
        System.out.println("        CÉG");
        vonal('*', 20, true);
    }

    private static void datumEsNevKiirasa() {
        System.out.println("");
        vonal('_', 7, false);
        vonal(' ', 6, false);
        vonal('_',7, true);
        System.out.print(" Dátum");
        vonal(' ', 6, false);
        System.out.println("   Név");
    }

    private static int osszesFogyasztas() {
        //összegzés tétele:
        int osszesen = 0;
        for (int i = 0; i < tetelDb; i++) {
            osszesen += tetelek[i];
        }
        return osszesen;
    }

    private static void tetelekKiirasa() {
        for (int i = 0; i < tetelDb; i++) {
            System.out.printf("%10s: %5d %s\n", "Tétel 1", tetelek[i], HUF);
        }
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

    private static int szervizDijErteke(int szervizDijMertek) {
        return osszesFogyasztas() / szervizDijMertek;
    }

    private static void erteketKiir(String szoveg, int osszesen) {
        System.out.printf("%10s: %5d %s\n", szoveg, osszesen, HUF);
    }
}
