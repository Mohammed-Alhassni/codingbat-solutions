package src.Logic1;

public class alarmClock {
    public String alarmClock(int day, boolean vacation) {
        if (vacation && day > 0 &&  day < 6){
            return "10:00";
        } else if ((day == 6 || day == 0) && vacation){
            return "off";
        } else if ((day == 6 || day == 0) && !vacation){
            return "10:00";
        }else {
            return "7:00";
        }
    }
}
