
package hafta11;

import java.util.Scanner;

public class throwOrnegi {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        int yas=klavye.nextInt();
        try{
            yasKontrol(yas);
        }
        catch(ArithmeticException e){
            System.out.println("20 yasından kucukler dısarı cıkamaz");
        }
    }
    public static void yasKontrol(int yas){
        if(yas<20){
            throw new ArithmeticException();
        }
        else{
            System.out.println("Dışarı çıkabilirsiniz");
        }
    }
            
}
