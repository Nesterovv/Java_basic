import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_5 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("c{3,}");
        Matcher m = p.matcher("Cococo cacaca cecece");
        while (m.find()) {
            System.out.println(m.start() + " " + m.group());
        }
    }
}