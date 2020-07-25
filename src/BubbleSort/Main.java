package BubbleSort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Implementation sort = new Implementation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int userInputArrayLength = scanner.nextInt();
        int userInputArray[] = new int[userInputArrayLength];
        System.out.println("Enter the elements");
        for (int i = 0; i < userInputArrayLength; i++) {
            userInputArray[i] = scanner.nextInt();
        }

        sort.BubbleSort(userInputArray);
        System.out.println("Sorted Array is :");
        sort.displaySortedArray(userInputArray);
    }
}
