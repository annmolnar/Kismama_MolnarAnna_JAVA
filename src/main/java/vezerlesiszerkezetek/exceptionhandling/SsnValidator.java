package vezerlesiszerkezetek.exceptionhandling;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class SsnValidator {

    public static void main(String[] args) {
        SsnValidator s = new SsnValidator();
        System.out.println(s.isValidSsn("092259324"));
    }

    public boolean isValidSsn(String ssn) {
        try {
            int oddsResult = 0;
            int evensResult = 0;
            int result = 0;
            int lDigit = 0;
            for (int i = 0; i < ssn.length(); i++) {
                if (i % 2 == 0 && i != 8) {
                    char odd = ssn.charAt(i);
                    String o = Character.toString(odd);
                    oddsResult += parseInt(o) * 3;
                    //System.out.println(oddsResult);
                } else if (i % 2 != 0) {
                    char even = ssn.charAt(i);
                    String e = Character.toString(even);
                    evensResult += parseInt(e) * 7;
                    //System.out.println(e);
                    //System.out.println(evensResult);
                    char lastDigit[] = {ssn.charAt(8)};
                    String l = new String(lastDigit);
                    lDigit = parseInt(l);
                }
                result = oddsResult + evensResult;

                //System.out.println(result);


            }
            return result % 10 == lDigit;
        } catch (NumberFormatException numberFormatException){
            return false;
        }
    }

}
