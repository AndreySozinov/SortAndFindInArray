package ru.savrey.lesson2;

public class App {

    public static void main(String[] args) {


        /**
         * Поиск элемента в массиве
         */
        int[] array = ArrayPrepare.createArray();
        ArrayPrepare.printArray(array);
        ArraySorting.quickSort(array);
        ArrayPrepare.printArray(array);

        System.out.println(ArrayFinding.binarySearch(array, 91));

        /**
         * ДОМАШНЕЕ ЗАДАНИЕ: Сортировка кучей
          */
//        int[] array = ArrayPrepare.createArray();
//        ArrayPrepare.printArray(array);
//
//        ArraySorting.heapSort(array);
//        ArrayPrepare.printArray(array);


        /**
         * ДРУГИЕ СПОСОБЫ СОРТИРОВКИ
         */

//        int[] array1 = ArrayPrepare.createArray();
//        ArrayPrepare.printArray(array1);
//
//        ArraySorting.selectionSort(array1);
//        ArrayPrepare.printArray(array1);
//
//        int[] array2 = ArrayPrepare.createArray();
//        ArrayPrepare.printArray(array2);
//
//        ArraySorting.quickSort(array2);
//        ArrayPrepare.printArray(array2);
    }
}
