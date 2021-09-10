import java.util.Arrays;

public class Task_3 {

    public static void main(String[] args) {
        int arr_1[] = {0, 1, 2, 3, 4, 5, 8, 13};
        int[] arr_2 = new int[arr_1.length];
        for (int i = arr_1.length - 1; i > 0; ) {
            for (int j = 0; j < arr_1.length; j++) {
                arr_2[j] = arr_1[i];
                i--;
            }
        }
        System.out.println(Arrays.toString(arr_2));

    }
}
