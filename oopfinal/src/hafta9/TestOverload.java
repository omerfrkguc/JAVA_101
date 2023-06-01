
package hafta9;

public class TestOverload {
    public static void main(String[] args) {
        A a = new A();
        a.p(10);
        a.p(20.0);
        
    }
}
class B {
    public void p(double i){
        System.out.println(i*2);
    }
    
}
class A extends B{
    public void p(int i){
        System.out.println(i);
    }
}