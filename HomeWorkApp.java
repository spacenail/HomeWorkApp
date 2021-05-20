import java.util.Random;

public class HomeWorkApp {
    public static void main(String[] args) {
/*1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
[ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1,
 1 на 0;
 */
        int[] array = new int[10];
        arrayInit(array);
        arrayReverse(array);
    }

    static void arrayInit(int[] array) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) { array[i] = rnd.nextInt(2); }
    }

    static void arrayReverse(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
    }
}


