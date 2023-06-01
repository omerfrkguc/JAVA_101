/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta6;

/**
 *
 * @author omerg
 */
public class Cember {

    private double yaricap;

    public Cember() {
        // 1. yontem
        super(); //2.yontem
    }

    public Cember(double yaricap) {
        this.yaricap = yaricap;
    }

    public Cember(double yaricap, String renk, boolean doluMu) {
     //   super(renk, doluMu);
        this.yaricap = yaricap;
    }

    public double alanHesapla() {
        return Math.PI * yaricap * yaricap;
    }

    public double cevreHesapla() {
        return Math.PI * 2 * yaricap;
    }

    public double capHesapla() {
        return yaricap * 2;
    }

    public void yazdir() {
     //   System.out.println(super.getOlusturulmaTarihi() + " tarihinde oluşturuldu ve yarıçapı: " + getYaricap());
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }
}
