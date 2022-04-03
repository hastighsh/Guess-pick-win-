package com.example.guess_pick_win;

public class RandomNumberGenerator
{

    public static int ranNum;



    public RandomNumberGenerator(){
        ranNum = 0;
    }

    /*generating random number based on the selected difficulty level
    easy lvl -> 1 to 5
    medium lvl -> 1 to 10
    hard lvl -> 1 to 15
    */
    public int makeRandomNumber(){
        gameModel difficulty = new gameModel();
        int num = difficulty.getDifficulty();

        if (num == 1){

            int min = 1, max = 5;
            ranNum = (int)(Math.random() * ((max - min + 1) + min));
            return ranNum;

        } else if (num == 2) {

            int min = 1, max = 10;
            ranNum = (int)(Math.random() * ((max - min + 1) + min));
            return ranNum;

        } else if (num == 3) {

            int min = 1, max = 10;
            ranNum = (int)(Math.random() * ((max - min + 1) + min));
            return ranNum;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public int getRanNum()
    {
        return this.ranNum;
    }
}
