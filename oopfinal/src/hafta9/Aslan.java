
package hafta9;

public class Aslan extends PolimorfizmHayvan{

    public Aslan(String isim) {
        super(isim);
    }
    
    @Override
    public String konus(){
        return this.getIsim() + "kükrer.";
    }
}
