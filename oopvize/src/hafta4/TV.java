/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta4;

/**
 *
 * @author omerg
 */
public class TV {

    int kanal = 1;
    int sesSeviyesi = 1;
    boolean acikMi = false;

    public TV() {
    }

    public void ac() {
        acikMi = true;
    }

    public void kapat() {
        acikMi = false;
    }

    public void kanalayarla(int yeniKanal) {
        if (acikMi && yeniKanal <= 120 && yeniKanal >= 1) {
            kanal = yeniKanal;
        }
    }
    public void sesAyarla(int yeniSes){
        if(acikMi && yeniSes <=7 && yeniSes >= 1){
            sesSeviyesi = yeniSes;
        }
    }
    public void kanalYukari(){
        if(acikMi && kanal < 120){
            kanal++;
        }
    }
    public void kanalAsagi(){
        if(acikMi && kanal > 1){
            kanal--;
        }
    }
    public void sesYukarı(){
        if(acikMi && sesSeviyesi < 7){
            sesSeviyesi++;
        }
    }
    public void sesAssagi(){
        if(acikMi && sesSeviyesi > 1){
            sesSeviyesi--;
        }
    }
}








