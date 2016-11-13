import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Random;

public final class OverlapArrays {
    private static final double EPSILON = 0.0000001;

    public static double[] intersection(double[] firstArray, double[] secondArray) {
        if (firstArray == null || secondArray == null) {
            throw new IllegalArgumentException();
        }
        if (firstArray.length == 0 || secondArray.length == 0) {
            throw new IllegalArgumentException();
        }

        int nextResultCell = 0;
        double[] result = new double[countCells(firstArray, secondArray)];

        for (int posInFirstArray = 0; posInFirstArray < firstArray.length; posInFirstArray++) {
            for (int posInSecondArray = 0; posInSecondArray < secondArray.length; posInSecondArray++) {
                if (Math.abs(firstArray[posInFirstArray] - secondArray[posInSecondArray]) < EPSILON) {
                    result[nextResultCell++] = firstArray[posInFirstArray];
                }
            }
        }
        return result;
    }

    private static int countCells(double[] firstArray, double[] secondArray) {
        int cells = 0;
        for (int posInFirstArray = 0; posInFirstArray < firstArray.length; posInFirstArray++) {
            for (int posInSecondArray = 0; posInSecondArray < secondArray.length; posInSecondArray++) {
                if (Math.abs(firstArray[posInFirstArray] - secondArray[posInSecondArray]) < EPSILON) {
                    cells++;
                }
            }
        }
        return cells;
    }

    public static void printIntersection(double[] array) {
        if (array.length != 0) {
            System.out.println("Array of intersection is : " + "\n" + Arrays.toString(array));
        } else System.out.println("No intersection");
    }

    /**
     * @param array    инициализированный пустой массив
     * @param rangeMin минимальное значение для случайного числа
     * @param rangeMax максимальное значение для случайного числа
     */

    public static double[] doRandom(double[] array, double rangeMin, double rangeMax) {

        Random doubleRand = new Random();
/**
 * Math.rint использован поскольку nextDouble() возвращает большое количество цифр после запятой
 * в методе intersection никода не будет одиноковых чисел.
 */
        for (int position = 0; position < array.length; position++) {
            array[position] = rangeMin + (rangeMax - rangeMin) * doubleRand.nextDouble();

        }
        for (int i = 0; i < array.length; i++) {
            array[i] = new BigDecimal(array[i]).setScale(1, RoundingMode.HALF_UP).doubleValue();
        }
        return array;
    }

    public static boolean testIntersection(double[] firstArray, double[] secondArray) {
        double[] resultArray = {2.1, 2.2};

        return Arrays.equals(resultArray, intersection(firstArray, secondArray));
    }

}
