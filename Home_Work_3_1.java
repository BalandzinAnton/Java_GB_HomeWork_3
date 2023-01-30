package HomeWork.HomeWork_3;
//Реализовать аалгоритм сортировки слиянием

public class Home_Work_3_1 {

    public static void main(String args[]) {
        int[] array = {12, 6, 4, 1, 15, 10, 7, 9, 13, 11, 7};
        divisionArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void divisionArray(int[] array) {
        int arraySize = array.length;
        if (arraySize == 1) return;
        int middle = arraySize / 2;
        int [] arrayLeft = new int[middle];
        int [] arrayRight = new int[arraySize - middle];
        for (int i = 0; i < middle; i++) {
            arrayLeft[i] = array[i];
        }
        for (int i = middle; i < arraySize; i++) {
            arrayRight[i - middle] = array[i];
        }
        divisionArray(arrayLeft);
        divisionArray(arrayRight);
        mergeArray(array, arrayLeft, arrayRight);
    }

    private static void mergeArray(int[] array, int[] arrayLeft, int[] arrayRight) {
        int i = 0;
        int j = 0;
        int indexResult = 0;
        while (i < arrayLeft.length && j < arrayRight.length){
            if(arrayLeft[i] < arrayRight[j]) {
                array[indexResult] = arrayLeft[i];
                i++;
            }
            else {
                array[indexResult] = arrayRight[j];
                j++;
            }
            indexResult++;
        }
        for (int k = i; k < arrayLeft.length; k++) {
            array[indexResult++] = arrayLeft[k];
        }
        for (int r = j; r < arrayRight.length; r++) {
            array[indexResult++] = arrayRight[r];
        }
    }
}
