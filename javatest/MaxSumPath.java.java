class MaxSumPath {

    static int findMaxSumPath(int[] array1, int[] array2) {
        int sumArray1 = 0, sumArray2 = 0, result = 0;
        int index1 = 0, index2 = 0;
        int length1 = array1.length, length2 = array2.length;

        while (index1 < length1 && index2 < length2) {
            if (array1[index1] < array2[index2]) {
                sumArray1 += array1[index1++];
            } else if (array1[index1] > array2[index2]) {
                sumArray2 += array2[index2++];
            } else { 
                result += Math.max(sumArray1, sumArray2) + array1[index1];
                sumArray1 = 0;
                sumArray2 = 0;
                index1++;
                index2++;
            }
        }

        while (index1 < length1) {
            sumArray1 += array1[index1++];
        }
        while (index2 < length2) {
            sumArray2 += array2[index2++];
        }

        result += Math.max(sumArray1, sumArray2);
        return result;
    }

    public static void main(String[] args) {
        int[] array1 = {3, 6, 7, 8, 10, 12, 15, 18, 100};
        int[] array2 = {1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50};
        System.out.println("Maximum sum path: " + findMaxSumPath(array1, array2));
    }
}
