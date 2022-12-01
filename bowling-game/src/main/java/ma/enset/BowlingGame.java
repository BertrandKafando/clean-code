package ma.enset;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
   private int counter=0;
   int[] rolls = new int[22];
  List<Frame> frames= new ArrayList<Frame>();

    public void roll(int pindowns){
        rolls[counter++]= pindowns;
   
    }

   public int score() {
    int basescore = 0;
    int bonus = 0;
    //basescore
    for (int i =0; i<rolls.length; i++){
        basescore += rolls[i];
    }
    System.out.println("basescore: "+basescore);

   //build frames
    for (int i=0; i<rolls.length-1; i=i+2){
    /*    if(rolls[i]==10){
            Frame frame = new Frame(rolls[i],0);
            frames.add(frame);
        } else{
            Frame frame = new Frame(rolls[i],rolls[i+1]);
            frames.add(frame);
            i++;
        }*/ 
        Frame frame = new Frame(rolls[i],rolls[i+1]);
        frames.add(frame);
    }

    //calculate bonus
    for(int i=0; i<frames.size()-1; i++){
        if(frames.get(i).isStrike()){
            bonus += frames.get(i+1).getFirstRoll() + frames.get(i+1).getSecondRoll();
       } 
       if(frames.get(i).isSpare()){
            bonus += frames.get(i+1).getFirstRoll();
        } 

        
     }


  

    return basescore + bonus;
    }
}

class Frame {
    private int firstRoll;
    private int secondRoll;

    public Frame(int firstRoll, int secondRoll) {
        this.firstRoll = firstRoll;
        this.secondRoll = secondRoll;
    }
    public int getFirstRoll() {
        return firstRoll;
    }
    public int getSecondRoll() {
        return secondRoll;
    }


    public boolean isStrike() {
        return firstRoll == 10 && secondRoll == 0;
    }

    public boolean isSpare() {
        return firstRoll + secondRoll == 10 && firstRoll != 10;
    }
}
