package nyelviElemek.time;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        /*Time time1= new Time(1,2,2);
        Time time2 = new Time(1,3,1);*/
        /*System.out.println(time1.getInMinutes());
        System.out.println(time1.getInSeconds());

        System.out.println(time2.earlierThan(time1));

        System.out.println(time1.toString());*/

        System.out.println("Please give me a time (hours, minutes, seconds).");
        Time time1=new Time(1,1,1);
        Scanner scanner = new Scanner(System.in);
        time1.hour= scanner.nextInt();
        scanner.nextLine();
        time1.minute=scanner.nextInt();
        scanner.nextLine();
        time1.second=scanner.nextInt();
        scanner.nextLine();
        System.out.println(time1.getInSeconds());

        System.out.println("Please give me another time (hours, minutes, seconds).");
        Time time2=new Time(1,1,1);
        time2.hour= scanner.nextInt();
        scanner.nextLine();
        time2.minute=scanner.nextInt();
        scanner.nextLine();
        time2.second=scanner.nextInt();
        scanner.nextLine();
        System.out.println(time2.getInSeconds());

        System.out.println(time2.earlierThan(time1));
        System.out.println(time1.toString());


    }





}
