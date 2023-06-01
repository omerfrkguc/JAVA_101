/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta3;

/**
 *
 * @author omerg
 */
public class elemanlartoplami {
    public static void main(String[] args) {
        double[] liste = new double[5];
        double toplam = 0;
        for(int i = 0; i<liste.length; i++){
            liste[i] = Math.random()*10;
            System.out.println(liste[i]);
            toplam += liste[i];
        }
        System.out.println("toplamı : " + toplam);
    }
}
