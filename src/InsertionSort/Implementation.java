package InsertionSort;

public class Implementation {

    public void InsertionSort(int array[]) {
        int arrayLength = array.length;

        for (int index = 1; index < arrayLength; index++) {
            int compareKey = array[index];
            int secondIndex = index - 1;

            while (secondIndex >= 0 && compareKey < array[secondIndex]) {
                array[secondIndex + 1] = array[secondIndex];
                secondIndex--;
            }
            array[secondIndex + 1] = compareKey;
        }
    }

    public void displaySortedArray(int sortedArray[]) {
        for (int index = 0; index < sortedArray.length; index++) {
            System.out.print(sortedArray[index] + " ");
        }
    }
}
