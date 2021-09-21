import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_8 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d{4}([-]|)\\d{4}([-]|)\\d{4}([-]|)\\d{4}");
        Matcher matcher = pattern.matcher("3453-3554-4453-3242");
        matcher.find();
        System.out.println(matcher.group(0));

    }
}
