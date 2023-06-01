
package hafta10;

import java.util.ArrayList;

public class ALOrnegi {
    public static void main(String[] args) {
        ArrayList<String> sehirListesi=new ArrayList<>();
        sehirListesi.add("Bandırma");
        sehirListesi.add("Ankara");
        sehirListesi.add("İstanbul");
        sehirListesi.add("Yozgat");
        sehirListesi.add("Sivas");
        sehirListesi.add("Karabuk");
        sehirListesi.add("Tokat");
        sehirListesi.add("Gebze");
        
        System.out.println("Listenin boyutu: " + sehirListesi.size());
        System.out.println("Listede Yozgat var mı?: " + sehirListesi.contains("Yozgat"));
        System.out.println("Sivas sehrinin indeksi: " + sehirListesi.indexOf("Sivas"));
        System.out.println("Sehır listesi bos mu?: " + sehirListesi.isEmpty());
        System.out.println(sehirListesi.toString());
        sehirListesi.add(3, "Bursa");        
        System.out.println(sehirListesi.toString());
        sehirListesi.remove("Karabuk");
        System.out.println(sehirListesi.toString());
        sehirListesi.remove(0);
        System.out.println(sehirListesi.toString());
        
        for (int i = 0; i < sehirListesi.size(); i++) {
            System.out.println(sehirListesi.get(i));
            
        }
    }
}
