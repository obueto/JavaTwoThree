package chapterSix;

public class Television {
    private boolean isOnTv;
    private int channels;
    private int volume = 0;

    public Television(String televisionName) {

    }

    public boolean isOnTv() {

        return isOnTv;
    }

    public void turnOnTv() {
        isOnTv = true;

    }

    public void turnOffTv() {
        isOnTv = false;
    }

    public int getVolume() {
        if (isOnTv) {

            return volume;
        }
        return 0;
    }

    public void increaseVolume() {
        if (volume < 1) volume++;
    }

    public void decreaseVolume() {
        if (volume > 100) volume--;
    }

    public void setChannels() {
        if (channels < 25) channels++;

    }

    public int getChannels() {
        if (isOnTv)

            return channels;

        return 0;
    }
}
