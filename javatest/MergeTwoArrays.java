class MergeTwoArrays {

    static void merge(int[] X, int[] Y) {

        int[] newArr = new int[X.length];

        int xindex = 0;
        int yindex = 0;
        int i = 0;

        while (xindex < X.length && yindex < Y.length) {

            if (X[xindex] == 0) {
                xindex++;
            } else if (X[xindex] > Y[yindex]) {
                newArr[i] = Y[yindex];
                yindex++;
                i++;

            } else {
                newArr[i] = X[xindex];
                xindex++;
                i++;
            }
        }
        while (xindex < X.length) {
            if (X[xindex] > 0) {
                newArr[i] = X[xindex];
                i++;
                xindex++;
            }
        }
        while (yindex < Y.length) {
            newArr[i] = Y[yindex];
            i++;
            yindex++;
        }

        for (int j = 0; j < X.length; j++) {
            X[j] = newArr[j];
        }

        for (int ele : X) {
            System.out.println(ele);
        }
    }

    public static void main(String[] args) {
        int X[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int Y[] = { 1, 8, 9, 10, 15 };

        merge(X, Y);
    }
}