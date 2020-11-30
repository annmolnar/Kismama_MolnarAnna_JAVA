package vezerlesiszerkezetek.controlselection.month;

public class DayInMonth {
    public int returnNumberOfDays(int year, String month) {
        String monthLc = month.toLowerCase();
        int numberOfDays;
        if (year % 400 == 0 && monthLc.equals("február")) {
            numberOfDays = 29;}
            else if (year % 100 == 0 && monthLc.equals("február")) {
                numberOfDays = 28;}
                else if (year % 4 == 0 && monthLc.equals("február")) {
                numberOfDays = 29;
        } else {

            switch (monthLc) {
                case "január":
                case "március":
                case "május":
                case "július":
                case "augusztus":
                case "október":
                case "december":
                    numberOfDays = 31;
                    break;
                case "április":
                case "június":
                case "szeptember":
                case "november":
                    numberOfDays = 30;
                    break;
                case "február":
                    numberOfDays = 28;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid month: " + month);
            }
        }
        return numberOfDays;
    }

    public static void main(String[] args) {
        DayInMonth dayInMonth = new DayInMonth();
        System.out.println(dayInMonth.returnNumberOfDays(1996, "AUGUSZTUSs"));
    }

}
