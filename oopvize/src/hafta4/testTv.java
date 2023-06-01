/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta4;

/**
 *
 * @author omerg
 */
public class testTv {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.ac();
        tv1.kanalayarla(30);
        tv1.sesAyarla(3);
        
        System.out.println("1. Tv nın kanalı: " + tv1.kanal + " sesi: " + tv1.sesSeviyesi);

        TV tv2 = new TV();
        tv2.ac();
        tv2.kanalYukari();
        tv2.kanalYukari();
        tv2.sesYukarı();
        
        System.out.println("2. Tv nın kanalı: " + tv2.kanal + " sesi: " + tv2.sesSeviyesi);
        
        tv2.kapat();
        tv2.kanalYukari();
        tv2.sesYukarı();
        System.out.println("2. Tv nın kanalı: " + tv2.kanal + " sesi: " + tv2.sesSeviyesi);
        
    }
}
