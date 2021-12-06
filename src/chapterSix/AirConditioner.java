package chapterSix;

public class AirConditioner {

    private int temperature;
    private boolean isOn;

    public AirConditioner (String AcName){

    }

    public boolean isOn() {
        return isOn;
    }
    public void turnOn () {
        isOn = true;
    }
    public void turnOff(){
        isOn = false;
    }
public int getTemperature(){
        if (isOn)
            return temperature;
        return 0;
}
public void increaseTemperature(){
        if(isOn){
            if (temperature < 30) temperature++;
        }
}
public void decreaseTemperature(){
        if(temperature > 16) temperature--;
}
}
