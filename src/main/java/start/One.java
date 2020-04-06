package start;


import java.util.Scanner; // импорт сканнера

public class One {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя: ");

        if (scan.hasNext()) {
            String name = scan.next();
            name = name.substring(0, 1).toUpperCase() + name.substring(1);
            System.out.println("Добро пожаловать " + name);

        } else  {
            System.out.println("Извините, но это не слово. Перезапустите программу и попробуйте снова!");
        }
    }
}



