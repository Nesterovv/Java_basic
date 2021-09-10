public class Task_6 {

    public static void main(String[] args) {
        int[][] twoDimArray = {{1, 3}, {1, 2}};
        int [][] twoDimArray_2 = {{1, 1}, {1, 2}};
        int [][] twoDimArray_3 = new int[2][2];
        int [][] twoDimArray_4 = new int[2][2];
        for (int i = 0; i < twoDimArray_3.length; i++) {
            for (int j = 0; j < twoDimArray_3[i].length; j++) {
                twoDimArray_3[i][j] = twoDimArray[i][j] + twoDimArray_2[i][j];
                System.out.print(" " + twoDimArray_3[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < twoDimArray_4.length; i++) {
            for (int j = 0; j < twoDimArray_4[i].length; j++) {
                twoDimArray_4[i][j] = twoDimArray[i][j] - twoDimArray_2[i][j];
                System.out.print(" " + twoDimArray_4[i][j]);
            }
            System.out.println();

        }
    }
}