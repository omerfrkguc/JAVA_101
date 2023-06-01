/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta4;

/**
 *
 * @author omerg
 */
public class testogrenci {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci();
        System.out.println("adı : " + ogr1.adi);
        System.out.println("yaş : " + ogr1.yas);
        System.out.println("ybs ogrencisi mi ? " + ogr1.ybsMi);
        System.out.println("cinsiyet : " + ogr1.cinsiyet);
   
    ogr1.ybsMi = true;
        System.out.println("ybs mi : " + ogr1.ybsMi);
    
    }
        
}
