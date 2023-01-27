package ru.savrey.lesson2;

import java.util.Random;

public class ArrayPrepare {

    /**
     * создание массива заданной длины с случайными числами от 0 до 99
     * @param n длина массива
     * @return массив целочисленных значений
     */
    public static int[] createArray(int n){
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = random.nextInt(100);
        }
        return array;
    }

    /**
     * создание массива случайной длины от 5 до 10 с случайными числами от 0 до 99
     * @return массив целочисленных значений
     */
    public static int[] createArray(){
        int length = random.nextInt(10) + 5;
        int[] array = new int[length];
        for(int i = 0; i < length; i++){
            array[i] = random.nextInt(100);
        }
        return array;
    }

    /**
     * вывод массива в терминал
     * @param array массив целочисленных значений
     */
    public static void printArray(int[] array){
        for(int element : array){
            System.out.printf("%d \t", element);
        }
        System.out.println();
    }

    private static Random random = new Random();

}
