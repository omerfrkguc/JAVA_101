
package hafta9;

public class TestOverride {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.p(10);
        aa.p(20.0);
          System.out.println(aa.toString());// id numara
        BB bb = new BB();
        bb.p(30);
        bb.p(40.0);
        
    }
}
class BB{
    
    public void p(double i){
        System.out.println(i*2);
    }
}
class AA extends BB{
    @Override
    public void p(double i){
        System.out.println(i);
    }
}