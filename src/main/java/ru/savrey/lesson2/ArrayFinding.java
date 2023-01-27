package ru.savrey.lesson2;

public class ArrayFinding {

    /**
     * обычный поиск числа в массиве
     * @param array массив целочисленных значений
     * @param value целое число
     * @return индекс элемента в массиве или -1
     */
    public static int ordinarySearch(int[] array, int value){
        for(int i = 0; i < array.length; i++){
            if (array[i] == value)
                return i;
        }
        return -1;
    }

    /**
     * бинарный поиск числа в массиве
     * @param array упорядоченный массив целочисленных значений
     * @param value целое число
     * @param start начальный индекс
     * @param end конечный индекс
     * @return индекс элемента в массиве или -1
     */
    private static int binarySearch(int[] array, int value, int start, int end){
        int middle = (end - start) / 2 + start;

        if(start <= end) {
            if (value < array[middle]) {
                return binarySearch(array, value, start, middle - 1);
            } else if (value > array[middle]) {
                return binarySearch(array, value, middle + 1, end);
            } else if (array[middle] == value)
                return middle;
        }
        return -1;
    }

    /**
     * бинарный поиск числа в массиве
     * @param array упорядоченный массив целочисленных значений
     * @param value целое число
     * @return индекс элемента в массиве или -1
     */
    public static int binarySearch(int[] array, int value){
        return binarySearch(array, value, 0, array.length-1);
    }
}
