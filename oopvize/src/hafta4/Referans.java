/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta4;

/**
 *
 * @author omerg
 */
public class Referans {
    public static void main(String[] args) {
        int i =1;
        int j =2;
        i = j ;
        i++;
        System.out.println("i : " + i);
        System.out.println("j : " + j);
        
        Cember c1 = new Cember(5);
        Cember c2 = new Cember(10);
        
        c1 = c2;
        
        System.out.println("C1 r: " + c1.yaricap);//10
        System.out.println("c2 r: " +c2.yaricap);//10
        c1.yaricap = 25;
        System.out.println("C1 r: " + c1.yaricap);//25
        System.out.println("C2 r: " + c2.yaricap);//25
    }
}
