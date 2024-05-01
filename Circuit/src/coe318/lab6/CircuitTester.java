/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;

/**
 *
 * @author babye
 */
public class CircuitTester {
    
    public static void main(String[] args) {
    
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        
        Resistor r1 = new Resistor(10, node1, node2);
        Resistor r2 = new Resistor(20, node1, node3);
        
        Circuit cir = Circuit.getInstance();
        cir.add(r1);
        cir.add(r2);
        
        System.out.println(cir);
        
        
  }
    
}
