
public class MainStartClass {
    public static void main(String[] args) {
        double[] firstArray = {2.1,2.2};
        double[] secondArray= {2.1,2.2};
        double[] resultArray = OverlapArrays.intersection(firstArray,secondArray);

        OverlapArrays.printIntersection(resultArray);
        System.out.println(OverlapArrays.testIntersection(firstArray,secondArray));


        double[] randFirstArray = new double[10];
        double[] randSecondArray = new double[10];

        OverlapArrays.doRandom(randFirstArray, 0, 20);
        OverlapArrays.doRandom(randSecondArray, 0, 15);

        double[] resultRandArray = OverlapArrays.intersection(randFirstArray,randSecondArray);

        OverlapArrays.printIntersection(resultRandArray);

    }
}
