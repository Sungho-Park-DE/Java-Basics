public class GreatestDifferenceFinder {
    int greatestDifference(int[] intArray) {
        int max = 0;
        int min = 0;
        if (intArray.length<3)
            return 0;
        max = maxFinder(intArray);
        min = minFinder(intArray);
        return max-min;

    }

    public int maxFinder(int[] intArray) {

        int temp=intArray[0];
        for (int i = 0; i <= intArray.length-1; i++) {
            if (temp <= intArray[i])
                temp = intArray[i];
        }
        return temp;
    }

    public int minFinder(int[] intArray) {


        int temp = intArray[0];
        for (int j : intArray) {
            if (temp >= j)
                temp = j;
        }
        return temp;
    }

}
