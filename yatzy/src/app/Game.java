package app;


import static app.GameLogic.menu;

public class Game {

    Dice dice = new Dice();

    public static void main(String[] args){

        GameLogic gamelogic = new GameLogic();


        menu();
        gamelogic.roll();
    }




}
