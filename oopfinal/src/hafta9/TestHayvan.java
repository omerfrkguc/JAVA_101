
package hafta9;

public class TestHayvan {
    public static void main(String[] args) {
        PolimorfizmHayvan kedi = new Kedi("Boncuk ");
        PolimorfizmHayvan kopek = new Kopek("arap ");
        PolimorfizmHayvan at = new At("düldül ");
        PolimorfizmHayvan asln = new Aslan("max ");
        
        System.out.println(kedi.konus());
        System.out.println(kopek.konus());
        System.out.println(at.konus());
        System.out.println(asln.konus());
    
    }
}
