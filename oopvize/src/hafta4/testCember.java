/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta4;

/**
 *
 * @author omerg
 */
public class testCember {
    public static void main(String[] args) {
        Cember c1 = new Cember();
        c1.setYaricap(1);
        System.out.println("yarıcapı : " + c1.yaricap);
        System.out.println("alanı : " + c1.alanHesapla());
        System.out.println("cevresi : " + c1.cevreHesapla());

        Cember c2 = new Cember(25);
        System.out.println("yarıcapı : " + c2.yaricap);
        System.out.println("alanı : " + c2.alanHesapla());
        System.out.println("cevresi : " + c2.cevreHesapla());

        System.out.println("alanı : " + new Cember(125).alanHesapla());       
        System.out.println("cevre : " + new Cember(125).cevreHesapla());
    }
}
