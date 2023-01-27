package ru.savrey.lesson2;

public class ArraySorting {

    /**
     * пирамидальная сортировка (сортировка кучей)
     * @param array массив целочисленных значений
     */
    public static void heapSort(int[] array){
        int n = array.length;

        // [1.] Построение кучи
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);

        // [2.] Перемещение элементов
        for (int i = n - 1; i >= 0; i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }

    /**
     * преобразование поддерева в двоичную кучу
     * @param array массив целочисленных значений
     * @param arrayLength размер кучи
     * @param rootIndex корневой узел
     */
    private static void heapify(int[] array, int arrayLength, int rootIndex){
        int largest = rootIndex;
        int left = 2 * rootIndex + 1;
        int right = 2 * rootIndex + 2;

        if (left < arrayLength && array[left] > array[largest])
            largest = left;

        if (right < arrayLength && array[right] > array[largest])
            largest = right;

        if (largest != rootIndex){
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            heapify(array, arrayLength, largest);
        }
    }

    /**
     * сортировка выбором
     * @param array массив целочисленных значений
     */
    public static void selectionSort(int[] array){
        for(int i = 0; i < array.length-1; i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[min])
                    min = j;
            }
            if(min != i){
                array[min] = array[min] + array[i];
                array[i] = array[min] - array[i];
                array[min] = array[min] - array[i];
            }
        }
    }

    /**
     * быстрая сортровка
     * @param array массив целочисленных значений
     */
    public static void quickSort(int[] array){
        quickSort(array, 0, array.length-1);
    }

    private static void quickSort(int[] array, int startPosition, int endPosition) {
        int middle = array[(endPosition + startPosition) / 2];
        int left = startPosition;
        int right = endPosition;

        do{
            while (array[left] < middle)
                left++;
            while (array[right] > middle)
                right--;
            if (left <= right) {
                if (left < right) {
                    int temp = array[right];
                    array[right] = array[left];
                    array[left] = temp;
                }
                left++;
                right--;
            }
        }
        while (left <= right);

        if(left < endPosition)
            quickSort(array, left, endPosition);
        if(right > startPosition)
            quickSort(array, startPosition, right);
    }
}
