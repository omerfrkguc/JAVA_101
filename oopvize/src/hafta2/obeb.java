/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta2;

/**
 *
 * @author omerg
 */
public class obeb {

    public static int obeb(int a, int b) {
        int obebSonuc = 0;
        int buyuksayi = 0;
        int kucuksayi = 0;
        if (a < b) {
            buyuksayi = b;
            kucuksayi = a;
        } else {
            buyuksayi = a;
            kucuksayi = b;
        }
        System.out.println("buyuksayi " + buyuksayi + " kucuksayi " + kucuksayi);
        for (int i = buyuksayi; i>0 ; i--) {
            
            if (a % i == 0 && b % i == 0) {
                obebSonuc = i;
                break;
            }
            
        }

        return obebSonuc;
    }
    public static void main(String[] args) {
        System.out.println("obeb :" + obeb(15, 5));
    }
}
