/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta4;

import java.util.Random;

/**
 *
 * @author omerg
 */
public class randomSinifi {
    public static void main(String[] args) {
        Random r1 = new Random(5);
        for (int i = 0; i <10; i++){
            System.out.println(r1.nextInt(1000)+"");
        }
        System.out.println("");
        Random r2 = new Random(5);
        for(int i =0; i<10; i++){
            System.out.println(r2.nextInt(1000)+"");
        }
    }
}
