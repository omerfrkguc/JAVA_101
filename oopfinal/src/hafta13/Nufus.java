
package hafta13;

import java.util.Date;

public class Nufus {
    public static void main(String[] args) {
        Ogrenci o1=new UnvOgrenci();
        o1.getDogumTarihi();
    }
}
abstract class Insan implements NufusCuzdani{
    
}
abstract class Ogrenci extends Insan implements OgrenciKarti{
    public boolean bursDurumu(boolean durum){
        return durum;
    }
}
class UnvOgrenci extends Ogrenci{
String ad;
    @Override
    public String getAd() {
        return ad;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSoyad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSehir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Date getDogumTarihi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getOkul() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSinif() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getOkulNumarasi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

abstract class Surucu extends Insan implements SurucuEhliyeti{
    abstract boolean kazayaKaristiMi();
}

