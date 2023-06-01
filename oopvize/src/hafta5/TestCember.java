/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta5;

/**
 *
 * @author omerg
 */
public class TestCember {

    public static void main(String[] args) {
        StaticCember c3 = new StaticCember(10);
        System.out.println("Yaricapi: " + c3.yaricap);
        System.out.println("Alanı: " + c3.alanHesapla());
        System.out.println("Cevresi: " + c3.cevreHesapla());
        System.out.println("Nesne Sayısı: " + c3.nesneSayisi);
        //2. yöntem
        System.out.println("Nesne Sayisi: " + StaticCember.nesneSayisi);

        c3.setYaricap(15);
        System.out.println("Yaricapi: " + c3.yaricap);
        System.out.println("Alanı: " + c3.alanHesapla());
        System.out.println("Cevresi: " + c3.cevreHesapla());
        System.out.println("Nesne Sayısı: " + c3.nesneSayisi);

    }
}
