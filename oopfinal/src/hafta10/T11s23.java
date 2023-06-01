/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta10;

/**
 *
 * @author omerg
 */
public class T11s23 {
    public static void main(String[] args) {
        //new AA();
       new BB();
    }}
class AA {
    int i = 7;
    public AA() {
        setI(20);
        System.out.println("i from A is " + i);    }
    public void setI(int i) {
        this.i = 2 * i;
    }}
class BB extends AA {
    
    public BB() {
        super();
        System.out.println("i from B is " + i);    }
    public void setI(int i) {
        this.i = 3 * i;    }}
