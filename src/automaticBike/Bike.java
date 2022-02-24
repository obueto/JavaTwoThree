package automaticBike;

public class Bike {
    private boolean isOn = false;
    private int speed;
    private int gear;

    public boolean isOn() {
        return isOn;
    }

    public boolean turnOn() {
        return isOn = true;
    }

    public boolean turnOff() {
        return isOn = false;
    }

    public void accelerate(int gear) {
        if (gear == 1){
            speed++;
        }
        else if (gear == 2){
            speed += 2;
        }
        else if (gear == 3){
            speed += 3;
        }
        else if (gear == 4){
            speed += 4;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void decelerate(int gear) {
        if (gear == 1){
            speed--;
        }
        else if (gear == 2){
            speed-= 2;
        }
        else if (gear == 3){
            speed -= 3;
        }
        else if (gear == 4){
            speed -= 4;
        }

    }

    public int getGear() {
        if (speed <=20){
            gear = 1;
        }
        else if (speed > 20 && speed <= 30){
            gear = 2;
        }
        else if (speed >= 31 && speed <= 40){
            gear = 3;
        }
        else {
            gear = 4;
        }
        return gear;
    }

}
