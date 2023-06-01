/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta4;

/**
 *
 * @author omerg
 */
public class Cember {
    double yaricap = 1;
    
    public Cember() {
    }
    Cember(double y){
        yaricap = y;
        
    }
    double alanHesapla(){
        return Math.PI*yaricap*yaricap;
    }
    double cevreHesapla(){
        return 2*Math.PI*yaricap;
    }

    public void setYaricap(double y) {
        yaricap = y;
    }
    
    
    
    
    
    
    
    
}
