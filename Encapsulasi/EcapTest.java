/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulasi;

/**
 *
 * @author senja007
 */
public class EcapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(30);
        
        System.out.println("Name : " + encap.getName());
        System.out.println("Age : "+ encap.getAge());
    }
    
}
