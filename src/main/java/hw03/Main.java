package hw03;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int taskChoice;
        while (true) {
            System.out.println("Для выбора задачи \n Удаление чётных чисел введите: 1 \n Минимальное, максимальное, среднее арифметическое: 2");
            try {
                taskChoice = Integer.parseInt(sc.next());
                if (taskChoice == 1) {
                    removeEvenNumbers();
                    break;
                }
                if (taskChoice == 2) {
                    minMaxAverage();
                    break;
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Введите корректный номер задачи");
            }
        }
    }

    public static ArrayList<Integer> generateRandomList() {
        int maxNumberValue = 100;
        Scanner userNumber = new Scanner(System.in);
        System.out.println("Введите количество элементов списка: ");
        int userSize = userNumber.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < userSize; i++) {
            arr.add(random.nextInt(maxNumberValue+1));
        }
        return arr;
    }


    public static void removeEvenNumbers() {
        ArrayList<Integer> arr2 = generateRandomList();

        arr2.removeIf(num -> (num % 2 == 0));

        System.out.println(arr2);
    }

    public static void minMaxAverage() {
        ArrayList<Integer> arr3 = generateRandomList();

        int minNumber = Collections.min(arr3);
        int maxNumber = Collections.max(arr3);
        int sum = 0;
        for(int num : arr3) {
            sum += num;

        }
        float averageOfNumbers = (float)sum / arr3.size();
        System.out.println(arr3);
        System.out.printf("Минимальный элемент: %d\n", minNumber);
        System.out.printf("Максимальный элемент: %d\n", maxNumber);
        System.out.printf("Среднее арифметическое: %.2f\n", averageOfNumbers);
    }
}
