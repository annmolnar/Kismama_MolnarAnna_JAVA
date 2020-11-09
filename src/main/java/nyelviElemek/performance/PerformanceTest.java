package nyelviElemek.performance;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {
    public static void main(String[] args) {
        Performance performance = new Performance(LocalDate.of(2000,1,5),"Prince", LocalTime.of(20,00),LocalTime.of(21,00));
        System.out.println(performance.getInfo());
    }

}
