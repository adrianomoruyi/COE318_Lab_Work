/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

import java.util.Scanner;

/**
 *
 * @author babye
 */
public class UserMain {

    public static void main(String args[]) {
        Circuit cir = Circuit.getInstance();
        Element currentElement;

        Scanner stdin = new Scanner(System.in);

        System.out.println("Please type in your elements in the format (element node1 node2 elementvalue): ");

        String userinput;
        
        for (int i = 0; i == 0;) {
            userinput = stdin.nextLine();

            if (userinput.equals("end")) 
            {
                i = 1;
                System.out.println("All Done");
            } 
            else if (userinput.equals("spice")) 
            {
                for (int j = 0; j < cir.getElementList().size(); j++)
                {
                    currentElement = cir.getElementList().get(j);
                    if (currentElement.getIsVolt() == true)
                    {
                        System.out.println("V" + currentElement.getId() + " " + currentElement.getNode1() 
                                + " " + currentElement.getNode2() + " DC " + currentElement.getValue());    
                    }
                    else
                    {
                        System.out.println("R" + currentElement.getId() + " " + currentElement.getNode1() 
                                + " " + currentElement.getNode2() + " " + currentElement.getValue());
                    }
                }
            } 
            else 
            {
                cir.add(new Element(userinput));
            }
        }
    }
}
