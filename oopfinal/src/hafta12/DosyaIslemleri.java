/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author omerg
 */
public class DosyaIslemleri {
    public static void main(String[] args) {
        dosyaOlustur();
        dosyaBilgileriniGetir();
        dosyaYaz();
        dosyaOku();
       // dosyaSil();
    }
    public static void dosyaOlustur(){
        File dosya=new File("C:\\Users\\omerg\\Masaüstü");
        try{
           if(dosya.createNewFile()){
               System.out.println("Dosya olusturuldu");
           } 
           else{
               System.out.println("Dosya olusturulamadı");
           }
        }
        catch(IOException e){
            
        }        
    }
    
    public static void dosyaBilgileriniGetir(){
        File dosya=new File("C:\\Users\\Zeynep\\Documents\\NetBeansProjects\\NO(2022)\\src\\Hafta122\\deneme.txt");
        if(dosya.exists()){
            System.out.println("Dosya Adı: " + dosya.getName());
            System.out.println("Dosya Yolu: " + dosya.getPath());
            System.out.println("Dosya yazılabilir mi?: " + dosya.canWrite());
            System.out.println("Dosya okunabilir mi?: " + dosya.canRead());
            System.out.println("Dosya boyutu: " + dosya.length());
        }
    }
    public static void dosyaOku(){
        File dosya=new File("C:\\Users\\Zeynep\\Documents\\NetBeansProjects\\NO(2022)\\src\\Hafta122\\deneme.txt");
        try{
           Scanner okuyucu=new Scanner(dosya);
           while(okuyucu.hasNextLine()){
               String satir=okuyucu.nextLine();
               System.out.println(satir);
           }
           okuyucu.close();
        }
        catch(FileNotFoundException filenotfound){
            
        }
    }
    
    public static void dosyaYaz(){
  
        try{
            FileWriter  yazici=new FileWriter("C:\\Users\\Zeynep\\Documents\\NetBeansProjects\\NO(2022)\\src\\Hafta122\\deneme.txt");
            yazici.write("Yönetim Bilişim Sistemleri");
            System.out.println("Dosyaya yazıldı.");
            yazici.close();
        }
        catch(IOException io){
            
        }
    }
    
    public static void dosyaSil(){
       File dosya=new File("C:\\Users\\Zeynep\\Documents\\NetBeansProjects\\NO(2022)\\src\\Hafta122\\deneme.txt");
       try{
          if(dosya.delete()){
              System.out.println(dosya.getName() + " silindi");
          }
          else{
              System.out.println("Silme başarısız");
          }
       }
       catch(Exception e){
           
       }
    }
    
}
