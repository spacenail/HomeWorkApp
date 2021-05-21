import java.util.Arrays;
import java.util.Random;

public class HomeWorkApp {
    public static void main(String[] args) {
/*1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
[ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1,
 1 на 0;*/

        int[] array1 = new int[10];
        arrayInit1(array1, 2);
        arrayMod1(array1);

/*2. Задать пустой целочисленный массив длиной 100. С помощью цикла
заполнить его значениями 1 2 3 4 5 6 7 8 … 100;*/

        int[] array2 = new int[100];
        arrayInit2(array2);

/*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
 пройти по нему циклом, и числа меньшие 6 умножить на 2;*/

        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        arrayMod3(array3);

/*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов
 одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
  (можно только одну из диагоналей, если обе сложно). Определить элементы одной из
   диагоналей можно по следующему принципу: индексы таких элементов равны, то есть
    [0][0], [1][1], [2][2], …, [n][n];
 */
        int[][] array4 = new int[10][10];
        arrayInit4(array4);
        //arrayPrint(array4);

    /* 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
 и возвращающий одномерный массив типа int длиной len, каждая ячейка которого
  равна initialValue; */

        //arrayPrint(arrayInit5(10,1));

        /* 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы*/

        int[] array6 = {0, 1, 2, 3, 23, 5, 6, -1, 1};
        int min = 0, max = 0;
        for (int i = 0; i < array6.length; i++) {
            if (array6[i] > max) {
                max = array6[i];
            }
            if (array6[i] < min) {
                min = array6[i];
            }
        }
        //System.out.printf("min=%s max=%s", min, max);
    }



    static void arrayInit1(int[] array, int bound) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(bound);
        }
    }

    static void arrayInit2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    static void arrayInit4(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][array[i].length-(1+i)] = 1;
            for(int j = 0; j < array[i].length; j++){
                if(i == j){ array[i][j] = 1;}
            }
        }
    }
    static void arrayPrint(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for(int j = 0; j < array[i].length;j++){
                System.out.print(array[i][j]);
            }
        }
    }

    static void arrayPrint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    static void arrayMod1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
    }

    static void arrayMod3(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) { array[i] = array[i] * 2; }
        }
    }

    static int[] arrayInit5(int len, int initialValue){
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++){
            array[i] = initialValue;
        }
        return array;
    }
}


