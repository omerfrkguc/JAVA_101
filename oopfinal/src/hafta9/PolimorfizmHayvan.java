
package hafta9;

public class PolimorfizmHayvan {
    private String isim;

    public PolimorfizmHayvan(String isim) {
        this.isim = isim;
    }
    public String konus(){
        return "hayvan konusuyor...";
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
