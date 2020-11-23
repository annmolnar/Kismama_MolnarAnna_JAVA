package tipusokEsOperatorok.enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {
    public List<DayType> dayTypes(Day firstDay, int numberOfDays) {
        List<DayType> dt = new ArrayList<>();
        int index = firstDay.ordinal();
        for (int i = index; i < numberOfDays+index; i++) {
            dt.add(nextDay(firstDay).values()[i].getDayType());
            System.out.println(nextDay(firstDay).values()[i]);
            //System.out.println(nextDay(firstDay).values()[i].getDayType());
        }
        return dt;
    }



    private Day nextDay(Day day){
      Day nextDay = day;
      int index = day.ordinal();
      Day[] days = Day.values();
        for(int i=0;i<days.length;i++){
            if(day.equals(Day.SUNDAY)){
                nextDay = Day.MONDAY;
            }
            else nextDay = days[index+1];
            //System.out.println(nextDay);
        }
        return nextDay;

    }

}
