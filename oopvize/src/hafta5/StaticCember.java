/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta5;

/**
 *
 * @author omerg
 */
public class StaticCember {
    double yaricap=1;
    static int nesneSayisi=0;
    public StaticCember() {
        yaricap=5;
        nesneSayisi++;    }   
    public StaticCember(double y) {
        yaricap=y;
        nesneSayisi++;    }

    StaticCember(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    double alanHesapla(){
        return Math.PI*yaricap*yaricap;    }
    double cevreHesapla(){
        return Math.PI*2*yaricap;    }
    public void setYaricap(double y) {
        yaricap = y;    }    
    public static int getNesneSayisi() {
        return nesneSayisi;  
    }
}
