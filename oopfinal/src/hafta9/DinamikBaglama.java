package hafta9;

public class DinamikBaglama {

    public static void main(String[] args) {
           m(new MezunOgrenci());
           m(new Ogrenci());
           m(new Kisi());
           m(new Object());
    }
    public static void m(Object o){
        System.out.println(o.toString());
    }
}

class Kisi extends Object {

    @Override
    public String toString() {
        return "Kisi";
    }
    
}

class Ogrenci extends Kisi {

    @Override
    public String toString() {
        return "Ogrenci";
    }
}
class MezunOgrenci extends Ogrenci{
    
}
