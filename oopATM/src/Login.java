
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author omerg
 */
public class Login {

    public boolean login(Hesap hesap) {

        Scanner scanner = new Scanner(System.in);
        String kullanici_adi;
        String parola;

        System.out.println("Kullanici Adı : ");
        kullanici_adi = scanner.nextLine();
        System.out.println("Parola : ");
        parola = scanner.nextLine();

        if (hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getParola().equals(parola)) {
            return true;
        } else {
            return false;
        }
    }
}
