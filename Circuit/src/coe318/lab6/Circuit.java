/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;

import java.util.ArrayList;

/**
 *
 * @author babye
 */
public class Circuit {

    private ArrayList<Resistor> resistList = new ArrayList<Resistor>();
    private static Circuit instance = null;

    public static Circuit getInstance() {
        if (instance == null) {
            instance = new Circuit();
        }
        return instance;
    }

    private Circuit() {
    } //Yes, the constructor is PRIVATE!

    public void add(Resistor r) {
        resistList.add(r);
    }

    @Override
    public String toString() {
        String output = "";
        
        for (int i = 0; i < resistList.size(); i++) {
            output += resistList.get(i) + "\n";
        }
        return output;
    }

}
