/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta2;

/**
 *
 * @author omerg
 */
public class rakamlartoplamı {

    public static int rakamlarıtoplamı(int sayi) {
        int toplam = 0;
        int gecici = sayi;
        while (gecici != 0) {
            int rakam = gecici % 10;
            toplam += rakam;
            gecici = gecici / 10;
        }

        return toplam;
    }
    public static void main(String[] args) {
        System.out.println(rakamlarıtoplamı(666));
    }
}
