/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta5;

/**
 *
 * @author omerg
 */
public class TestCemberPrivate {
    public static void main(String[] args) {
        CemberPrivate c1 = new CemberPrivate(10);
        System.out.println("Yarıcapı: " + c1.getYaricap());
        System.out.println("Alanı: " + c1.alanHesapla());
        
        c1.setYaricap(c1.getYaricap()*5);
        System.out.println("Yarıcapı: " + c1.getYaricap());
        System.out.println("Alanı: " + c1.alanHesapla());
        System.out.println("NEsne SAyısı: " +CemberPrivate.getNesneSayisi());
    }
}
