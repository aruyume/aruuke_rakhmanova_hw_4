import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();

        System.out.println("Введите 5 строк для списка А: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Список А" + (i + 1) + ": ");
            listA.add(scanner.nextLine());
        }
        System.out.println("Список А: " + listA);
        System.out.println();
        System.out.println("Введите 5 строк для списка Б: ");
        for (int j = 0; j < 5; j++) {
            System.out.print("Список Б" + (j + 1) + ": ");
            listB.add(scanner.nextLine());
        }
        System.out.println("Список Б: " + listB);
        System.out.println();
        System.out.println("Объединение списков А и Б в список С: ");
        for (int c = 0; c < 5; c++) {
            listC.add(listA.get(c));
            listC.add(listB.get(4 - c));
        }
        System.out.println("Список С: " + listC);
        listC.sort(Comparator.comparingInt(String::length));
        System.out.println("Отсортированный список С: " + listC);
    }
}