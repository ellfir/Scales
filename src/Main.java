import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t***Программа определения весов товаров***\n\n\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первый вес: ");
        double first = scanner.nextDouble();

        System.out.println("Введите второй вес: ");
        double second = scanner.nextDouble();

        System.out.println("Введите третий вес: ");
        double third = scanner.nextDouble();

        double greatest, average, smallest;

        // Определение наибольшего, среднего и наименьшего веса
        if (first > second && first > third) {
            greatest = first;
            if (second > third) {
                average = second;
                smallest = third;
            } else {
                average = third;
                smallest = second;
            }
        } else if (second > first && second > third) {
            greatest = second;
            if (first > third) {
                average = first;
                smallest = third;
            } else {
                average = third;
                smallest = first;
            }
        } else {
            greatest = third;
            if (first > second) {
                average = first;
                smallest = second;
            } else {
                average = second;
                smallest = first;
            }
        }

        // Вывод результатов
        System.out.println("Наибольший вес: " + greatest);
        System.out.println("Средний вес: " + average);
        System.out.println("Наименьший вес: " + smallest);
    }
}