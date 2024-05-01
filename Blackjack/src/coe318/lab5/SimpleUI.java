package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
        //FIX THIS
        System.out.println("The house is holding...");
        System.out.println(game.getHouseCards());
        System.out.println("You are holding...");
        System.out.println(game.getYourCards());
        
    }

  @Override
    public boolean hitMe() {
        //FIX THIS
        System.out.println("Want another card?");
        
        if (user.nextLine().equals("n"))
        {
            System.out.println("Card given.");
            return true;
        }
        
        return false;
    }

  @Override
    public void gameOver() {
        //FIX THIS
        System.out.println("The house is holding...");
        System.out.println(game.getHouseCards());
        System.out.println("You are holding...");
        System.out.println(game.getYourCards());

        System.out.println("Your score: " + game.score(game.getYourCards()));
        System.out.println("House score: " + game.score(game.getHouseCards()));
       
        if (game.score(game.getYourCards()) > 21 || game.score(game.getYourCards()) == game.score(game.getHouseCards()))
        {
            System.out.println("You Lose! House Wins!");
        }
        else if (game.score(game.getYourCards()) < 21 && 21 < game.score(game.getHouseCards()))
        {
            System.out.println("You Win!");
        }
        else
        {
            System.out.println("Tie!");
        }
        
    }

}