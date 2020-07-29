package SelectionSort;

public class Implementation {

    public void SelectionSort(int array[]) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[min_index]) {

                }
            }
        }
    }
}
