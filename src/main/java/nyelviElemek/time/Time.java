package nyelviElemek.time;

public class Time {
    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second){
        this.hour=hour;
        this.minute = minute;
        this.second= second;
    }

    public int getInMinutes(){
        return hour*60+minute;
    }

    public int getInSeconds(){
        return getInMinutes()*60+second;
    }

    public boolean earlierThan(Time time){
        if(time.getInSeconds()>this.getInSeconds()){
            return true;
        }
        else return false;
    }

    @Override
    public String toString() {
        return
                hour +": "+
               minute +": "
              + second
               ;
    }
}
