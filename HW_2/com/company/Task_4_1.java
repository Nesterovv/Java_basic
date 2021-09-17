public class Task_4_1 {
    public static void main(String[] args){

    }
}

class Cars {
    private String model;
  private  String [] color;

  void changeColor(Cars model, String color){
      //this.color = color;

  }

}

class BMW extends Cars{

    private String [] color = new String [] {"Orange", "Black", "Purple"};
}

class Audi extends Cars{
    private String [] color = new String [] {"Blue", "Red", "Green"};
}

class KiaColor extends Cars{
    private String [] color = new String [] {"Yellow", "Grey", "White"};
}


