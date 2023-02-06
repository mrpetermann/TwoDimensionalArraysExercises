public class TwoDimensionalArrays {
    /**
     * Increase each element of an array if it is
     *  positive or decrease each element if it is negative
     * @param arr 2D array of integers
     */
    public static int[][] increaseVariance(int[][] arr) {
        for(int i=0; i<arr.length; i++)
            for(int j=0; j<arr[i].length; j++)
                if(arr[i][j] > 0)
                    arr[i][j]++;
                else if(arr[i][j] < 0)
                    arr[i][j]--;

        return arr;
    }

    /**
     * Reorder a 2D array to have the highest row sum first
     * @param arr 2D array of integers to be sorted
     */
    public static int[][] prioritizeRow(int[][] arr) {
        //Initialize max sum to minimum possible value
        int maxSum = Integer.MIN_VALUE;
        int maxIndex = 0;

        //Find the max sum and the index where it occurs
        for(int i=0; i<arr.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arr[i].length; j++)
                rowSum += arr[i][j];
            if(rowSum > maxSum) {
                maxSum = rowSum;
                maxIndex = i;
            }
        }

        //Swap max with initial row
        int[] temp = arr[0];
        arr[0] = arr[maxIndex];
        arr[maxIndex] = temp;

        return arr;
    }

    /**
     * Transpose a 2D array
     * @param arr 2D array type int to transpose
     * @return Transposed array type int
     */
    public static int[][] transpose(int[][] arr) {
        //Create a new col x row array
        int[][] transposedArray = new int[arr[0].length][arr.length];

        //Assign each <i,j> to <j,i>
        for(int i=0; i<arr.length; i++)
            for(int j=0; j<arr[i].length; j++)
                transposedArray[j][i] = arr[i][j];

        return transposedArray;
    }

    /**
     * Order a 2D by greatest column sum first
     * @param arr 2D array type int to sort
     * @return Sorted 2D array type int
     */
    public static int[][] prioritizeColumn(int[][] arr) {
        return transpose(prioritizeRow(transpose(arr)));
    }
}