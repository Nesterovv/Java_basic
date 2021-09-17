public class Boxes {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.width = 10;
        box1.height = 10;
        box1.depth = 10;
        box1.verifying();

    }
}

class Box {

    int width;
    int height;
    int depth;
    void verifying () {
        if( width==height && width==depth){
            System.out.println("У вас куб");
        }
        else if (width!=depth && depth !=0){
            System.out.println("У вас обычная коробка");
        }
        else if (depth == 0 ){
            System.out.println("У вас конверт");
        }
    }
}