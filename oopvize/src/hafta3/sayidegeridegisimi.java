/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta3;

/**
 *
 * @author omerg
 */
public class sayidegeridegisimi {
    
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println("methottan once a : " + a + " b : " + b);
        degıstırme(a, b);
        System.out.println("methottan sonra a : " + a + " b : " + b);
    }
    public static void degıstırme(int a , int b){
        int gecici = a;
        a = b;
        b = gecici;
        System.out.println("b degeri " + b + " a degeri " + a);
    }
}
