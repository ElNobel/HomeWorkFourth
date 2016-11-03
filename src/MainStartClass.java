
public class MainStartClass {
    public static void main(String[] args) {
        double[] firstArray = {2.1,2.2,2.3,2.6,2.9,3.2,3.1};
        double[] secondArray= {2.1,2.4,2.5,2.6,3.1,2.9};
        double[] randFirstArray = new double[10];
        double[] randSecondArray = new double[10];

        OverlapArrays.searchOverlap(firstArray,secondArray);
        OverlapArrays.printOverlapArray();

        System.out.println();
        OverlapArrays.clearHashOverlap();

        OverlapArrays.doRandomArrays(randFirstArray,0,30);
        OverlapArrays.doRandomArrays(randSecondArray,10,50);
        OverlapArrays.searchOverlap(randFirstArray,randSecondArray);
        OverlapArrays.printOverlapArray();

    }
}
