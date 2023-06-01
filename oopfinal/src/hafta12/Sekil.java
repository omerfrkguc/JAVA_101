
package hafta12;


public abstract class Sekil {
    String isim;
    
    public Sekil(String isim){
        this.isim=isim;
    }
    public void isimYazdir(){
        System.out.println("Bu obje " + isim + "dir");
    }
    abstract void alanHesapla();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
