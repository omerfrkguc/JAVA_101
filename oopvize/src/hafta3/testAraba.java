/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta3;

/**
 *
 * @author omerg
 */
public class testAraba {
    public static void main(String[] args) {
        Araba arabam = new Araba();
        arabam.renk = "kırmızı";
        arabam.marka = "mercedes";
        arabam.model = "e200";
        arabam.vitesTipi= "otomatik";
        arabam.yakıttipi = "dizel";
        arabam.km=2000;
        arabam.yil=2008;
        arabam.kapısayısı=2;
        
        System.out.println("Haylimdeki Araba: \nRengi: "
                + arabam.renk
                + "\nMarkası: " + arabam.marka+ 
                "\nModeli: " + arabam.model +
                "\nVites Tipi: " + arabam.vitesTipi + 
                "\nYakıt Tipi: " + arabam.yakıttipi + 
                "\nKM: " + arabam.km + 
                "\nYılı: " + arabam.yil+
                "\nKapı Sayisi: " + arabam.kapısayısı);

    }
}
