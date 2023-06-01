
package hafta13;

public class Test {
    public static void main(String[] args) {
        Object[] nesneler={new Kaplan(), new Tavuk(), new Elma() };
        for (int i = 0; i < nesneler.length; i++) {
           if(nesneler[i] instanceof Yenilebilir)
                System.out.println(((Yenilebilir)nesneler[i]).nasilYenir()); 
           if(nesneler[i] instanceof Hayvan)
               System.out.println(((Hayvan)nesneler[i]).ses());
            System.out.println("");
        }
    
        
    }
 
}
abstract class Hayvan{
    public abstract String ses();
}
class Tavuk extends Hayvan implements Yenilebilir{
    @Override
    public String ses(){
        return "Gıd gıd gıdak";
    }
    @Override
    public String nasilYenir(){
        return "Köri sosu ile yenir";
    }
}
class Kaplan extends Hayvan{
    @Override
    public String ses(){
        return "RRRROAAAAARRRRR";
    }
}

abstract class Meyve implements Yenilebilir{
    
}
class Elma extends Meyve{
    @Override
    public String nasilYenir(){
        return "Elma kabuguyla yenir";
    }
}
class Portakal extends Meyve{
    @Override
    public String nasilYenir(){
        return "Portakalın suyu sıkılır ve içilir";
    }
}