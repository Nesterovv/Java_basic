public class Task_1 {

        public  static void main(String[] args) {
            int arr[] = {1,4,5,7,8,9,4};
            int n = 4 ;
            int sum = 0;
            for (int i = 0; i<arr.length; i++){
                if (arr [i] == n){
                    continue;
                } else {
                    sum += arr[i];
                }

            }
            System.out.println(sum);
        }
    }
