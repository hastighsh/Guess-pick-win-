package com.example.guess_pick_win;

class RunGame {
    private int score;
    private int highScore;


    public RunGame() {
        this.score = 0;
        this.highScore = 0;
    }

    public String compareAnswer(int ranNum, int inputNum){
        String result ="";

        if( ranNum == inputNum){
            result = "Congratulations!! Your guess is correct, Well Done!";
            this.score++;
        }
        else{
            result = "OOPS!! You lost :( Try again";
            this.score = 0;
        }

        return result;
    }

    public int getScore(){
        return this.score;
    }

    public void compareScore( int num){

        if(this.score > num ){
            this.highScore = this.score;
        }

    }
}

