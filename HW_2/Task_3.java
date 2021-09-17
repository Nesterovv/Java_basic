public class Task_3 {
    public static void main(String[] args){
        Sum sum1 = new Sum();
        int[] mas = new int[] {1,2,3,4,5,1,9,3,6,9};
        int sum3 = sum1.multiElement(mas);
        sum1.averageNum(sum3);

    }

}

class Sum {
    int sum =0;
    int average;

    int multiElement(int[] array){
            for (int j = array.length-1; j>array.length-6; j--) {

               sum  += array[j];
            }
        return sum;
    }

    void averageNum(int sum){
        average = sum/5;
        System.out.println(average);

    }

}