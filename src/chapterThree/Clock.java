package chapterThree;

public class Clock {
    private int hour;
    private int minutes;
    private int seconds;

    public Clock(int hour,int minutes, int seconds){
        if (hour > 23){
            hour = 0;
            minutes =0;
            seconds = 0;
        }
        this.hour = hour;
        if (minutes > 59){
            minutes = 0;
            seconds = 0;
        }
        this.minutes = minutes;
        if (seconds > 59){
            seconds = 0;
        }
        this.seconds = seconds;
    }

    public void setHour(int hour){
        if (hour > 23){
            hour = 0;
            minutes =0;
            seconds = 0;
        }
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setMinutes(int minutes) {
        if (minutes > 59){
            hour = 0;
            minutes = 0;
            seconds = 0;
        }
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setSeconds(int seconds) {
        if (seconds > 59){
            hour = 0;
            minutes = 0;
            seconds = 0;
        }
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void displayTime(){
        System.out.printf("%d:%d:%d",hour,minutes,seconds);
    }

}
