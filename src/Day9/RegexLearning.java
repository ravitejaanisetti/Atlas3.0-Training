package Day9;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLearning {

    public static void main(String args[]) {


        ArrayList<String> emails = new ArrayList<String>();

        emails.add("acanubhav@gmail.com");
            emails.add("@gmail.com");

        String regex = "([a-zA-Z0-9_.+-]+)@[a-zA-Z0-9_.+-]+\\.[a-zA-Z0-9_.+-]";

        Pattern pattern1 = Pattern.compile(regex);

        for (String email : emails) {
            Matcher matcher = pattern1.matcher(email);
            System.out.println(email + " : " + matcher.matches());
        }
    }
}