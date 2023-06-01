
import java.util.Scanner;

public class ATM {

    public void calis(Hesap hesap) {
        Login login = new Login();
        // Hesap hesap = new Hesap("Ömer Faruk","12345",2000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza hoşgeldiniz...");
        System.out.println("******************************");
        System.out.println("Kullanıcı girişi ");
        System.out.println("******************************");
        int giris_hakki = 3;

        while (true) {
            if (login.login(hesap)) {
                System.out.println("Giriş başarılı...");
                break;
            } else {
                System.out.println("Giriş başarısız..");
                giris_hakki--;
                System.out.println("kalan giriş hakkı : " + giris_hakki);
            }
            if (giris_hakki == 0) {
                System.out.println("giriş hakkınız bitti");
                return;
            }
        }
        System.out.println("**********************************");
        String islemler = "1.Bakiye görüntüle\n"
                + "2.Para Yatırma\n"
                + "3.Para Çekme\n"
                + "Çıkış için q ya basın";
        System.out.println(islemler);
        System.out.println("************************************");

        while (true) {
            System.out.println("İşlemi Seçiniz : ");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                break;
            } else if (islem.equals("1")) {
                System.out.println(hesap.getBakiye());
            } else if (islem.equals("2")) {
                System.out.println("yatırmak istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatır(tutar);
            }
            else if (islem.equals("3")){
                System.out.println("Çekmek istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
            
            }
            else{
                System.out.println("geçersiz işlem...");
            }

        }

    }

}
