package vezerlesiszerkezetek.controlselection.week;

public class DayOfWeek {
    public String getPartOfWeek(String day){
        String dayLc = day.toLowerCase();
        String partOfWeek;
        switch(dayLc){
            case "hétfő":
                partOfWeek = "hét eleje";
                break;
            case "kedd":
            case "szerda":
            case "csütörtök":
                partOfWeek = "hét közepe";
                break;
            case "péntek":
                partOfWeek="majdnem hétvége";
                break;
            case "szombat":
            case "vasárnap":
                partOfWeek = "hét vége";
                break;
            default:
                throw new IllegalArgumentException("Invalid day: " + day);



        }
        return partOfWeek;
    }
}


