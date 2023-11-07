package Com.Demo;

import java.util.Random;
import java.util.Scanner;

public class LadderSnake {
    public static void main(String[] args) {

        singleplayergame();

    }

    public static int rolldice() {
        Random random = new Random();
        return random.nextInt(6);


    }

    public static String CheckPlayOrNot() {
        String[] option = {"NO Play", "Ladder", "Snake"};
        Random random = new Random();
        return option[random.nextInt(option.length)];
    }

    public static void singleplayergame() {
        int position = 0;
        int diceRoll = 0;
        while (position < 100) {
            int dice = rolldice();
            diceRoll = diceRoll + dice;
            String option = CheckPlayOrNot();
            if (option.equals("NO PLAY")) {
                //DO NOTHING
            } else if (option.equals("ladder")) {
                int newposition = position + dice;
                if (newposition <= 100) {
                    position = newposition;
                }

            } else

                System.out.println("Dice roll: " + dice + ",option:" + option + ",position: " + position);
        }


        System.out.println("Number of dice rolls to win" + diceRoll);
        System.out.println("Final position:" + position);

    }
}



