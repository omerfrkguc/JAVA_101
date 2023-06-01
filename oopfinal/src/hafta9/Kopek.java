
package hafta9;

public class Kopek extends PolimorfizmHayvan{

    public Kopek(String isim) {
        super(isim);
    }
    @Override
    public String konus(){
        return this.getIsim() + "havlar.";
    }
}
