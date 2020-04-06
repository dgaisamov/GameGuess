package start;

import java.util.Random;
import java.util.Scanner;


public class NumbersTwo {
    public static void main(String args[]) {

        final int MIN = 1;
        final int MAX = 100;

        Random rand = new Random();
        int ranNumber = 0;

        System.out.println("загадай число от 1 до 100 ");
        System.out.println("для старта напиши: загадал ");

        Scanner sca = new Scanner(System.in);
        int tmin = MIN;
        int tmax = MAX;
        boolean win = false;
        while (!win) {
            String command = sca.nextLine();
            switch (command) {
                case "загадал":
                    ranNumber = rand.nextInt(MAX - MIN + 1) + MIN;
                    System.out.println(ranNumber);
                    break;
                case "угадал":
                    win = true;
                    break;
                case "больше":
                    tmin = ranNumber;
                    ranNumber = ranNumber + (tmax - tmin) / 2;
                    System.out.println(ranNumber);
                    break;
                case "меньше":
                    tmax = ranNumber;
                    ranNumber = ranNumber - (tmax - tmin) / 2;
                    System.out.println(ranNumber);
                    break;
            }
        }
        System.out.println("это было не сложно ,но спасибо за игру.\n Human, cыграем в первую игру?\nдля выхода нажми q");
    }
}