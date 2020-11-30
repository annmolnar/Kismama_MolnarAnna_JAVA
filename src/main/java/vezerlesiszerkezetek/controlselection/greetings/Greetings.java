package vezerlesiszerkezetek.controlselection.greetings;

public class Greetings {
    int hour;
    int minute;
    public String Greetings(int hour, int minute){
        String greeting;
        int timeInMinutes = hour*60+minute;
        if(timeInMinutes>=1200){
            greeting = "Jó éjt!";
        }
        else if(timeInMinutes>=1110){
            greeting = "Jó estét!";
        }
        else if(timeInMinutes>=540){
            greeting = "Jó napot!";
        }
        else {
            greeting = "Jó reggelt!";
        }

        return greeting;
    }

    public static void main(String[] args) {
        Greetings greeting = new Greetings();
        System.out.println(greeting.Greetings(5,20));
        System.out.println(greeting.Greetings(9,00));
        System.out.println(greeting.Greetings(18,29));
        System.out.println(greeting.Greetings(20,20));
    }


}
