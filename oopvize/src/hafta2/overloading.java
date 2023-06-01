/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta2;

/**
 *
 * @author omerg
 */
public class overloading {

    public static int max(int a, int b, int c) {
        int max = 0;
        if (a > b && a > c) {
            System.out.println("en buyuk sayi : " + a);
        } else if (b > a && b > c) {
            System.out.println("en buyuk sayi : " + b);

        } else {
            System.out.println("en buyuk sayi : " + c);
        }
        return max;
    }
    public static int max(int a) {
        int max = 0;
        System.out.println("en buyuk sayi : " + a);
        return max;
    }
    public static int max(int a, int b) {
        int max = 0;
        if (a > b) {
            System.out.println("en buyuk sayi : " + a);
        }
        else{
            System.out.println("en buyuk sayi : " + b);
        }
        return max;
    }
    public static void main(String[] args) {
        max(10);
        max(20, 50);
        max(30, 40, 60);
    }
}
