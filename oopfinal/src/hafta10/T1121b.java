/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta10;

/**
 *
 * @author omerg
 */
public class T1121b {

    public static void main(String[] args) {
        new Person().printPerson();
        new Student().printPerson();
    }}

class Student extends Person {
    private String getInfo() {
        return "Student";    }}

class Person {
    private String getInfo() {
        return "Person";    }
    public void printPerson() {
        System.out.println(getInfo());    }
}
