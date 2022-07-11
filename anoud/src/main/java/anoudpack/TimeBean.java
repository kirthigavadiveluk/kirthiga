package anoudpack;

import java.util.Calendar;

public class TimeBean {
	private int hour,minute,second;

    public TimeBean()
    {
        Calendar cal = Calendar.getInstance();
        hour    = cal.get(Calendar.HOUR);
        minute  = cal.get(Calendar.MINUTE);
        second  = cal.get(Calendar.SECOND);
     }
    public int getHour()   { return hour; }
    public int getMinute() { return minute; }
    public int getSecond() { return second; }
    public String getMessage()
    {
       return "Time: "+hour+":"+minute+":"+second;
    }   

}
