package app;

import java.util.Scanner;

public class MethodExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();
        System.out.println("Квадрат числа " + number + " дорівнює " + square(number) + ".");

        System.out.print("\nВведіть радіус: ");
        double radius = scanner.nextDouble();
        System.out.print("Введіть висоту: ");
        double height = scanner.nextDouble();
        System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + cylinderVolume(radius, height) + ".");


        System.out.print("\nВведіть кількість елементів масиву: ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Елемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Масив чисел: " + arrayToString(array));
        System.out.println("Сума всіх елементів масиву дорівнює " + sumArray(array) + ".");

        scanner.nextLine();
        System.out.print("\nВведіть рядок: ");
        String text = scanner.nextLine();
        System.out.println("Рядок в зворотньому порядку: " + reverseString(text));

        System.out.print("\nВведіть a: ");
        int a = scanner.nextInt();
        System.out.print("Введіть b: ");
        int b = scanner.nextInt();
        System.out.println("Результат " + a + "^" + b + " дорівнює " + power(a, b) + ".");

        System.out.print("\nВведіть ціле число n: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть текстовий рядок: ");
        String repeatedText = scanner.nextLine();
        printTextNTimes(n, repeatedText);
    }

    public static int square(int number) {
        return number * number;
    }


    public static double cylinderVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public static int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    public static void printTextNTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
