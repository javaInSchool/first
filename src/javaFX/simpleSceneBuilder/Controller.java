package javaFX.simpleSceneBuilder;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller implements Runnable{
    //@FXML
    public Label level;
    public Label score;  // = new Label("Your score: 0.0");
    public Label profit;
    public Label lvlCost;
    static double scoreValue = 0;
    static double profitValue = 1;
    int levelValue = 1;
    double levelUpCost = 5;

    public void getProfit() {
        scoreValue = scoreValue + profitValue;
        score.setText("Your score: "+ String.format( "%.2f",scoreValue));
    }

    public void getLevelUp() {
        if (scoreValue >= levelUpCost) {
            scoreValue = scoreValue-levelUpCost;                                // decrease score
            score.setText("Your score: "+String.format( "%.2f", scoreValue));   // set new score

            profitValue = profitValue+ Math.E+0.5*levelValue;                   // increase profit
            profit.setText("profit: " + String.format( "%.2f",profitValue));    //set new profit

            ++levelValue;                                                       // increase lvl
            level.setText("level: " + levelValue);                              //set new lvl

            levelUpCost = levelUpCost + Math.PI + Math.E*levelValue;            //count new price on lvl up
            lvlCost.setText("cost: " + String.format( "%.2f",levelUpCost));

        }
    }

    public void hire() {
        Thread t = new Thread(this);
        t.start(); // this will call run() function
    }

    @Override
    public void run() {
        while(true) {
            scoreValue = scoreValue + profitValue;
            //unknown how does it work
            Platform.runLater(new Runnable(){
                @Override
                public void run() {
                    score.setText("Your score: "
                            + String.format( "%.2f",scoreValue));
                }
            });
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
