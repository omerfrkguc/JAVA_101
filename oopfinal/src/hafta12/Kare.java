
package hafta12;

public class Kare extends Sekil{
    int kenar;

    public Kare(int kenar, String isim) {
        super(isim);
        this.kenar = kenar;
    }
    @Override
    void alanHesapla(){
        System.out.println("Karenin alanı " + (kenar*kenar));
    }
    public void cevreHesapla(){
        System.out.println("Karenin çevresi " + (kenar*4));
    }
}
