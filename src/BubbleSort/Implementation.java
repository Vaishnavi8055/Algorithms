package BubbleSort;

public class Implementation {

    public void BubbleSort(int array[]) {
        int lengthOfArray = array.length;
        for (int i = 0; i < lengthOfArray - 1; i++) {
            for (int j = 0; j < lengthOfArray - i - 1; j++) {
                if (array[j] > array[i]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void displaySortedArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
