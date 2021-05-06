package Stack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class HTMLMatchingTags {

    public static boolean isHMTLMatched(String html) {
        Stack<String> buffer = new Stack<>();
        int open_1 = html.indexOf("<");   // find first char "<"
        while (open_1 != -1) {   // found "<"
            int open_2 = html.indexOf(">", open_1 + 1);  // find next char ">"
            if (open_2 == -1)   // didn't find means invalid syntax
                return false;
            String tagBetweenOpen = html.substring(open_1 + 1, open_2); // string between <..>
            if (!tagBetweenOpen.startsWith("/"))  // opening tags
                buffer.push(tagBetweenOpen);
            else {   // closing tags
                if (buffer.isEmpty())
                    return false;
                if (!tagBetweenOpen.substring(1).equals(buffer.pop()))  // 1 is to avoid "/" if got
                    return false;
            }
            open_1 = html.indexOf("<", open_2 + 1);
        }
        return buffer.isEmpty();
    }

    public static void main(String[] args) {
        StringBuilder contentBuilder = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(new FileReader("test.html"));
            String str;
            while ((str = in.readLine()) != null) {
                contentBuilder.append(str);
            }
            in.close();
        } catch (IOException e) {
        }
        String content = contentBuilder.toString();
        System.out.println(content);
        System.out.println(isHMTLMatched(content));

    }
}
