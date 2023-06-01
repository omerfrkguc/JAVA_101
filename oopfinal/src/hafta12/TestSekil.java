
package hafta12;


public class TestSekil {
    public static void main(String[] args) {
        Kare kar = new Kare(5,"karel");
        Daire dar = new Daire(8,"dari");
        
        kar.alanHesapla();
        kar.cevreHesapla();
        
        dar.alanHesapla();
        dar.cevreHesapla();
        
        Sekil kare2 = new Kare(10,"Kare2");
        kare2.isimYazdir();
        
        ((Kare)kare2).cevreHesapla();
    }
}
