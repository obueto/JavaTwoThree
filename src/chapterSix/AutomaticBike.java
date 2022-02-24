package chapterSix;

public class AutomaticBike {
    private boolean isOn;
    private boolean isOff;
    private int speed = 15;
    private int gear;

    public AutomaticBike(String name) {
    }

    public boolean isOn() {
        return isOn;
    }

    public boolean isOff() {
        isOff = true;
        return true;
    }


    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOff = true;
    }


    public void accelerate(int gear) {
        if (gear == 1) {
            speed++;
        }

        if (gear == 2) {
            speed += 2;
        }

        if (gear == 3) {
            speed += 3;
        }

        if (gear == 4) {
            speed += 4;
        }


    }

    public int getSpeed() {
        if (speed >= 0 && speed <= 20){
            gear = 1;
        }

        return speed;
    }

    public void decrease(int gear) {
        if (gear == 1) {
            speed--;
        }
        if (gear == 2) {
            speed -= 2;
        }
        if (gear == 3) {
            speed -= 3;
        }
        if (gear == 4){speed -=4;
    }

}

    public void setGear() {
        if (speed >= 0 & speed <= 20){
            gear = 1;
        }
        if (speed >= 21 && speed <=30){
            gear = 2;
        }
        if (speed >= 31 && speed <= 40){
            gear = 3;
        }
        if (speed >= 41){
            gear = 4;
        }
    }
    public int getGear(){
        return gear;
    }
}

