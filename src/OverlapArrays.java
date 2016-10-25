import java.util.HashMap;
import java.util.Random;

public class OverlapArrays {
    private static HashMap hashOverlap = new HashMap();

    public static void searchOverlap(double[] firstArray, double[] secondArray) {
        for (int posInFirstArray = 0; posInFirstArray < firstArray.length; posInFirstArray++) {
            for (int posInSecondArray = 0; posInSecondArray < secondArray.length; posInSecondArray++) {
                if (firstArray[posInFirstArray] == secondArray[posInSecondArray]) {
                    hashOverlap.put(posInFirstArray, firstArray[posInFirstArray]);
                }
            }
        }
    }

    public static void printOverlapArray() {
        System.out.print("The overlap array is: ");
            System.out.print(hashOverlap.values() + " ");
    }

    /**
     *
     * @param randomArray инициализированный пустой массив
     * @param rangeMin минимальное значение для случайного числа
     * @param rangeMax максимальное значение для случайного числа
     * @return
     */

    public static double[] doRandomArrays(double[] randomArray,double rangeMin,double rangeMax) {

        Random doubleRand = new Random();
/**
 * Math.rint использован поскольку nextDouble() возвращает большое количество цифр после запятой
 * в методе searchOverlap никода не будет одиноковых чисел.
 */
        for (int pos = 0; pos < randomArray.length; pos++) {
            randomArray[pos] = Math.rint(rangeMin + (rangeMax - rangeMin) * doubleRand.nextDouble());//
        }
        return randomArray;
    }

    public static void clearHashOverlap(){
        hashOverlap.clear();
    }

}
