/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;

/**
 *
 * @author babye
 */
public class Resistor {
    private static int idcounter = 1;
    private int id;
    private double resistance;
    
    private Node [] nodearray = new Node [2];
    
    private Node node1;
    private Node node2;
    
    public Resistor (double resistance, Node node1, Node node2) {
        if (resistance == 0 || resistance < 0) {
            throw new IllegalArgumentException("resistance cannot be 0 or negative");
        }
    
        id = idcounter;
        idcounter++;
        this.resistance = resistance;
        this.nodearray [0] = node1;
        this.nodearray [1] = node2;
        this.node1 = node1;
        this.node2 = node2;
    }
    
    public Node [] getNodes() {
        return nodearray;
    }
    
      @Override
    public String toString() {
        return "R" + id + " " + nodearray[0] + " " + nodearray[1] + " " + resistance;
    }
        
    
}
