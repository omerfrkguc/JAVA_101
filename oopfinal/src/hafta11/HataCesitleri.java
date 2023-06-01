
package hafta11;

public class HataCesitleri {
    public static void main(String[] args) {
//        int a=30/0;  //unc
//        System.out.println(a);
        
//        int[] b={1,2,3,4,5};
//        System.out.println(b[6]);

//        try{
//            int a=30/0; 
//        }
//        catch(ArithmeticException e){
//            System.out.println("Sayılar 0 a bölünemez");
//        }
        
        try{
            int[] b={1,2,3,4,5}; 
            System.out.println(b[6]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Dizi sınırı aşıldı");
            e.printStackTrace();
        }
        
        catch(IndexOutOfBoundsException e){
            
        }
        catch(RuntimeException e){
            
        }
        catch(Exception e){
            
        }
        finally{
            System.out.println("Ne olursa olsun ben çalışırım");
        }
        System.out.println("Buradayım");
        
    }
}

