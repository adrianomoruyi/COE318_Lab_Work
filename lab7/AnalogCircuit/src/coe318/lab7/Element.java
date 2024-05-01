/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author babye
 */
public class Element {
    
    private static int resIdCounter = 1;
    private static int voltIdCounter = 1;
    private int id;
    private boolean isVolt;
    private boolean negVolt = false;
    
    private double value;
    private String [] info = {};
    
    public Element (String input) {
        
        info = input.split(" ");
        
        value = Double.parseDouble(info[3]); 
        
        if (info[0].equals("r"))
        {
            id = resIdCounter;
            resIdCounter++;
            isVolt = false;
        }
        else if (info[0].equals("v"))
        {
            id = voltIdCounter;
            voltIdCounter++;
            isVolt = true;
        }
        
        else 
        {
            throw new IllegalArgumentException(info[0] + " does not count as an element type. Please use 'r' for resistors and 'v' for voltage sources.");
        }
        
    }
    public String getNode1()
    {
        if (isVolt == true && Integer.parseInt(info[2]) < Integer.parseInt(info[1]))
        {
          negVolt = true;
          return info[2];
        }
        else
        {
          return info[1];
        }
    }
    
    public String getNode2()
    {
        if (isVolt == true && Integer.parseInt(info[2]) < Integer.parseInt(info[1]))
        {
          negVolt = true;
          return info[1];
        }
        else
        {
          return info[2];
        }
    }
    
    public double getValue()
    {
        if (isVolt == true && negVolt == true)
        {
            value = value * (-1);
        }
        return value;
    }
    
    public boolean getIsVolt()
    {
        return isVolt;
    }
    
    public int getId ()
    {
        return id;
    }
    
}
