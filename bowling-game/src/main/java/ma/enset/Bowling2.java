package ma.enset;

public class Bowling2 {

    int counter = 0;

    int[] rolls = new int[21];

    public void roll(int pindowns) {
        rolls[counter++] = pindowns;
    }

    public int score() {
        int score = 0;
        int cursor = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (rolls[cursor] == 10) {
                score += 10 + rolls[cursor + 1] + rolls[cursor + 2];
                cursor++;
            } else if (rolls[cursor] + rolls[cursor + 1] == 10) {
                score += 10 + rolls[cursor + 2];
                cursor += 2;
            } else {
                score += rolls[cursor] + rolls[cursor + 1];
                cursor += 2;
            }
        }

        return score;

    }

}
