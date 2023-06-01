
package hafta10;

public class T11s22 {
    public static void main(String[] args) {
        A a=new A(3);
    }
}
class B{
    public B() {
        System.out.println("B cons");    }    
}
class A extends B{ 

    public A() {
        super();
    }
    
    public A(int t) {
        System.out.println("A cons");    }
    
}
