package MergeSort;

public class Implementation {

    void mergeArray(int array[], int leftIndex, int rightIndex, int middleIndex) {
        int lengthOfLeftSubArray = middleIndex - leftIndex + 1;
        int lengthOfRightSubArray = rightIndex - middleIndex;

        int LeftSubArray[] = new int[lengthOfLeftSubArray];
        int RightSubArray[] = new int[lengthOfRightSubArray];

        for (int index1 = 0; index1 < lengthOfLeftSubArray; index1++) {
            LeftSubArray[index1] = array[leftIndex + index1];
        }

    }
}
