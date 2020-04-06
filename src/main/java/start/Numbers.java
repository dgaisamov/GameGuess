package start;


import java.lang.Math;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        int chisla, gamer;
        Scanner input = new Scanner(System.in);    //input переменная.относится к классу Scanner

        System.out.println("я хочу сыграть с тобой в одну игру. " +
                "\nкомпьютер задумал число от 0 до 100.\nтвоя задача отгадать это число");
        System.out.println("(eсли струсил нажми Q и выходи)");


        chisla = (int) Math.floor(Math.random() * 100);

        do {

            System.out.print("         Введи число: ");

            gamer = input.nextInt();  // метод сканера nextInt() отвечает за то,
                                      // чтобы считать введенное пользователем  целое число с консоли

            if (gamer > chisla) System.out.println("Попробуй меньше!");

            else if (gamer < chisla) System.out.println("Попробуй больше!");

            else if (chisla =='q') break;

            else System.out.println("ты угадал. игра окончена.\nесть предложение" +
                        " от которого ты не можешь отказаться, \nсыграем в другую Макфлай?");

        } while (gamer != chisla);
        System.out.println("да/нет");
    }
}