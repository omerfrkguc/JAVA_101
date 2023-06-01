
package hafta12;

public class Daire extends Sekil {

    int yaricap;

    public Daire(int yaricap, String isim) {
        super(isim);
        this.yaricap = yaricap;
    }
   
    void alanHesapla(){
        System.out.println("Dairenin Alanı : " + (Math.PI*yaricap*yaricap));
    
    }
    void cevreHesapla(){
        System.out.println("Dairenin Cevresi : " +(Math.PI*yaricap*2) );
    }


    
}
