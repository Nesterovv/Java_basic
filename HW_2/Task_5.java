import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_5 {
    public static void main(String[] args) {
           Pattern pattern = Pattern.compile("\\b[a]\\w+|\\w+[a]\\b");
           Matcher matcher = pattern.matcher("asa");
           matcher.find();
           System.out.println(matcher.group(0));

    }
}