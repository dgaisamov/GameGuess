package start;

public class UserRegistrator {

    public static void main(String[] args) {
        String nameTwoWords = "Dima Usachev";
        String nameWithNumber = "Dima1";
        String nameCorrect = "Dima";
        System.out.println(checkName(nameTwoWords));
        System.out.println(checkName(nameWithNumber));
        System.out.println(checkName(nameCorrect));
    }

    public static boolean checkName(String name) {
        if (name.contains(" ")) {
            System.out.println("Имя должно состоять из 1 слова");
            return false;
        } else if (name.matches(".*\\d.*")) {
            System.out.println("Имя содержит цифры");
            return false;
        } else {
            System.out.println("Имя корректно, продолжайте...");
            return true;
        }
    }

    public void setName(String name) {

        if (name == null || !name.matches("[a-zA-Z]+")) {
        try {
            throw new UserRegistratorValidException();
        } catch (UserRegistratorValidException ex) {
            System.out.println("Поле Имя... не должно содержать числа ");

    public static String regName() {
        System.out.println("Введите имя:");
        return new Scanner(System.in).nextLine();
    }

    public static boolean checkAge(int age) {
        if (age <= 18) {
            System.out.println("Ваш возраст меньше 18, вход запрещен...");
            return false;
        } else {
            System.out.println("Возраст больше 18, добро пожаловать!");
            return true;
        }
    }

    public static int regAge() {
        System.out.println("Введите возраст:");
        return new Scanner(System.in).nextInt();
    }
}