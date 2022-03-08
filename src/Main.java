import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        LinkedList<String> strings = new LinkedList<String>();

        System.out.println("Enter all your strings:");
        // Считываем что ввел пользователь и заполняем массив до команды "END"
        do {
            strings.add(scanner.nextLine());
        } while (!strings.getLast().equals("END"));

        // Удаляем из массива команду "END"
        strings.removeLast();

        // Выводим что ввели
        System.out.println("\nYou enter " + strings.size() + " strings.");
        System.out.println("All your strings:");
        for (String string : strings) {
            System.out.println(string);
        }

        // отсортировали и вывели на экран что получилось
        TreeSet<String> treeStrings = new TreeSet<>(strings);

        System.out.println("All your sorted strings:");
        for (String string : treeStrings) {
            System.out.println(string);
        }
        
    }
}
