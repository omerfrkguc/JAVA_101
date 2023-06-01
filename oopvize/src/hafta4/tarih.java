/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta4;

import java.util.Date;

/**
 *
 * @author omerg
 */
public class tarih {
    public static void main(String[] args) {
        Date tarih1=new Date();
        System.out.println(tarih1.toString());
        
        java.util.Date tarih2= new java.util.Date();
        System.out.println(tarih2.getTime());
    }
}
