import java.util.Arrays;

public class Task_4 {

    public static void main(String[] args) {
        int[][] twoDimArray = {{-5, -7, -3, -17}, {7, 1, -1, 12}, {8, 1, 2, -3}};
        ;
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if (twoDimArray[i][j] > 0) {
                    positive++;
                } else {
                    negative++;
                }
            }
        }
            if (positive > negative) {
                System.out.println("Положительных чисел больше");
            } else if (positive == negative) {
                System.out.println("Положительных и отрицательных чисел одинаковое количество");
            } else if (positive < negative) {
                System.out.println("Отрицательных чисел больше");
            }

        }

}