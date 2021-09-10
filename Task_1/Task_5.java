import java.util.Arrays;

public class Task_5 {

    public static void main(String[] args) {
        int[][] twoDimArray = {{1, 1, 0, 0}, {1, 2, 0, 0}, {2, 3, 3, 0}, {4, 5, 7, 2}};

        int n = 0;
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if (twoDimArray[i][j] == 0 && i < j) {
                    n++;
                } else {
                    continue;
                }
            }

        }
        if (n == 6){
            System.out.println("У вас нижнетреугольная матрица");

        }

    }
}