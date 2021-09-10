public class Task_2 {

    public  static void main(String[] args) {
        int arr_1[] = {0,1,1,2,3,5,8,13};
        int n = 7 ;
        int sum = 0 ;
        for (int i = 0; i<n; i++){
            if (arr_1[i] % 2 == 0){
                sum += arr_1[i];
            } else {
                continue;
            }
        }
        System.out.println(sum);
    }
}
