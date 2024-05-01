/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;

/**
 *
 * @author babye
 */
public class Node {
    private static int idcounter = 0;
    private int id;
    
    public Node () {
        id = idcounter;
        idcounter++;
    }
    
       @Override
    public String toString() {
        return "" + this.id;
    }
    
}
