/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta6;

/**
 *
 * @author omerg
 */
public class CemberPrivate {
     private double yaricap=1;
    private static int nesneSayisi=0;

    public CemberPrivate() {
        yaricap=5;
        nesneSayisi++;
    }
    public CemberPrivate(double y) {
        yaricap=y;
        nesneSayisi++;    }
    double alanHesapla(){
        return Math.PI*yaricap*yaricap;    }
    double cevreHesapla(){
        return Math.PI*yaricap*2;    }
    public double getYaricap() {
        return yaricap;    }
    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;    }
    public static int getNesneSayisi() {
        return nesneSayisi;    }
    public static void setNesneSayisi(int nesneSayisi) {
        CemberPrivate.nesneSayisi = nesneSayisi;    }
    
}
