/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

import java.util.ArrayList;

/**
 *
 * @author babye
 */
public class Circuit {
    
    private ArrayList<Element> elementList = new ArrayList<Element>();
    private static Circuit instance = null;

    public static Circuit getInstance() {
        if (instance == null) {
            instance = new Circuit();
        }
        return instance;
    }

    private Circuit() {
    }

    public void add(Element e) {
        elementList.add(e);
    }
    
    public ArrayList<Element> getElementList()
    {
        return elementList;
    }
    
}
