package airConditioner;

import chapterSix.Television;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    @Test
    public void theTvCanBeTurnedOn() {
        Television sony = new Television("Sony tv");
        sony.turnOnTv();
        assertTrue(sony.isOnTv());
    }
    @Test
    public void theTvCanBeTurnedOff (){
        Television sony = new Television("Sony tv");
        sony.turnOffTv();
        assertFalse(sony.isOnTv());
    }
    @Test
    public void theTvCanIncreaseTheVolumeTest (){
        Television sony = new Television( "Sony tv");
        sony.turnOnTv();
        assertTrue(sony.isOnTv());
        sony.increaseVolume();
assertEquals(1,sony.getVolume());

    }


    @Test
    public void theTvChannelsAre25Test (){
        Television sony = new Television("Sony tv");
        sony.turnOnTv();
        sony.setChannels();
        sony.setChannels();
        sony.setChannels();
        sony.setChannels();
        assertEquals(4,sony.getChannels());
    }
}

