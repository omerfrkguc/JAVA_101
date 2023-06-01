
package hafta9;

public class TestHayvan2 {
    public static void main(String[] args) {
        konustur(new Kedi("Boncuk "));
        konustur(new Aslan("Max "));
        konustur(new At("Düldül "));
        konustur(new Kopek("Arap "));
    }
    public static void konustur(PolimorfizmHayvan hayvan){
        System.out.println(hayvan.konus());
    }
}
