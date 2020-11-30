package vezerlesiszerkezetek.advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.parseInt;

public class CSV {


    public static void main(String[] args) {
        CSV csv = new CSV();
        System.out.println(csv.filterLines(Arrays.asList("ABC-1233;Volvo;red", "ABC-123;2117;Volvo;red", "ABC1123;2007;Volvo;red", "ABC-123;2007;Volvo;red")));

        String words = "peter piper picked a ...";
        int numPs = 0;
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) != 'p') {
                continue;
            }

            numPs++;
        }
    }

    public List<String> filterLines(List<String> lines) {
        List<String> validLines = new ArrayList<>();
        for (String line : lines) {
            String[] parts = line.split(";");
            System.out.println(parts[0].length());

            if (parts.length != 4) {
                continue;
            }
            if (parts[0].length() != 7 ||!parts[0].contains("-"))
                continue;
            /*if (!parts[0].contains("-")) {
                continue;
            }*/
            if (parseInt(parts[1]) < 1970)
                continue;
            if (parseInt(parts[1]) > 2019) {
                continue;
            }
                validLines.add(line);
        }
        return validLines;
    }


}
