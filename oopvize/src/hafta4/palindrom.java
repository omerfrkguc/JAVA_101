/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta4;

/**
 *
 * @author omerg
 */
public class palindrom {
    public static int Palindrom(int sayi) {
        int sonuc;
        int sayi_birler;
        int sayi_yuzler;

        sayi_birler = sayi % 10;
        sayi_yuzler = sayi / 100;

        if (sayi_birler == sayi_yuzler) {
            sonuc = 1;
        } else {
            sonuc = 0;
        }

        return sonuc;
    }

    public static void main(String[] args) {
        System.out.println("dönen değer : " + Palindrom(323));
        int deger1 = Palindrom(323);
        if (deger1 == 1) {
            System.out.println("sayı palindrom sayıdır");
        } else {
            System.out.println("sayı palindrom degıldır");
        }

    }

    
}
