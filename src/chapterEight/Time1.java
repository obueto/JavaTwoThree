package chapterEight;

public class Time1 {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour,int minute,int second){
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);


        this.hour = hour;
        this.minute =  minute;
        this.second = second;
    }

    private void validateSecond(int second) {
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second was out of range");
        }
    }

    private void validateMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute was out of range");
        }
    }

    private void validateHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour, was out of range");
        }
    }
  public String toUniversalString(){
     return String.format("%02d:%02d:%02d",hour,minute,second);
 }
public String toString(){
   return String.format("%02d:%02d:%02d %s",((hour== 0 || hour == 12)? 12 : hour % 12),
      minute,second,(hour < 12 ? "AM" : "PM"));
    }
}
// methods that return boolean are called predicate methods