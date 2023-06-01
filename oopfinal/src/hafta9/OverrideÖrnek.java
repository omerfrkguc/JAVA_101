/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta9;

/**
 *
 * @author omerg
 */
public class OverrideÖrnek {
    public static void main(String[] args) {
        horoz hrz = new horoz();
        hrz.goster();
    }
}
class hayvan{
    public void goster(){
        System.out.println("Hayvan sesleri ");
    }
}
class horoz extends hayvan{
    @Override
    public void goster(){
        System.out.println("öter");
    }
}
        


