import java.util.Random;
import java.util.Scanner;

public class AstonTestTasks {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    //Составить алгоритм: если введенное число больше 7, то вывести "Привет"
    public static void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int number = sc.nextInt();
        String message = number > 7 ? "Привет" : "Вы ввели число меньше или равное 7";
        System.out.println(message);
    }

    //Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести "Привет, Вячеслав", если нет, то вывести
    // "Нет такого имени"
    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    //Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
    public static void task3() {
        Random rand = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println("Массив из случайных чисел выглядит так: ");
        for (int num : arr) {
            System.out.print(num + "|");
        }
        System.out.println();
        System.out.println("Элементы массива кратные трем:");
        for (int num : arr) {
            if (num % 3 == 0) {
                System.out.print(num + "|");
            }
        }
    }
}
