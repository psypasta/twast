package app;


public class Dice {

    private double diceUp;
    private double diceHighest = 6;
    private double diceLowest = 1;

    public double getDiceUp() {
        return diceUp;
    }

    public void setDiceUp(double diceUp) {
        this.diceUp = diceUp;
    }

    public double getDiceHighest() {
        return diceHighest;
    }

    public void setDiceHighest(double diceHighest) {
        this.diceHighest = diceHighest;
    }

    public double getDiceLowest() {
        return diceLowest;
    }

    public void setDiceLowest(double diceLowest) {
        this.diceLowest = diceLowest;
    }
}
