
package hafta13;

import java.util.Date;


    public interface NufusCuzdani {
    public String getAd();
    public String getSoyad();
    public String getSehir();
    public Date getDogumTarihi();
}

interface OgrenciKarti extends NufusCuzdani{
    public String getOkul();
    public String getSinif();
    public int getOkulNumarasi();
}
interface SurucuEhliyeti extends NufusCuzdani{
    public String getESinifi();
    public Date getEhliyetAldigiTarih();
}


