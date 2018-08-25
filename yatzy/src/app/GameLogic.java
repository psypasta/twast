package app;

import java.util.Scanner;

public class GameLogic {

    Scanner sc = new Scanner(System.in);
    private Dice dice = new Dice();
    private final int nOfThrows = 3;
    private int[] savedDices = new int[5];


    public void saveDices(int[] savedDices){

    }

    public static void menu(){
        System.out.println("Välkommen till Yatzy." +
                "\n" +
                "1.Slå ett av dina kast" + "" );
    }
    public double roll(){
        // När roll() blir kallad så ska den rulla och ge ett svar på en tärning.
        dice.setDiceUp(Math.floor(Math.random() * 6));
        return dice.getDiceUp();
    }
}
