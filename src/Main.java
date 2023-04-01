import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String firstLesson;

        final int NUM = 1;

        String word = "Первый урок";

        firstLesson = NUM + word;

        System.out.println(firstLesson);

        if (NUM < 0){
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0){
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = in.nextLine();
        System.out.println("Привет, " + name + "!");
    }
}