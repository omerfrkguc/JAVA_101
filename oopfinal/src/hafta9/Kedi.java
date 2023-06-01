
package hafta9;

public class Kedi extends  PolimorfizmHayvan{

    public Kedi(String isim) {
        super(isim);
    }
    @Override
    public String konus(){
        return this.getIsim() + "miyavlar .";
    }
}
