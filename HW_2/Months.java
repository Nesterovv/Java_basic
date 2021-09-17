public class Months {
public static void main(String[] args){
MonthandNumber month1 = new MonthandNumber();
month1.number(1);
 month1.month("May");
}
}

class MonthandNumber{
 String[] myArray = new String[] {"January","February","March","April","May","June", "July","August","September","October","November","December"};

 void number(int i){
 System.out.println(myArray[i-1]);
 }
 void month(String b){
  for (int i =0; i<myArray.length; i++){
   if (b == myArray[i] ){
    System.out.println(i+1);
   }
  }
 }
}
