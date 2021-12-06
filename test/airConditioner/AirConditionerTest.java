package airConditioner;

import chapterSix.AirConditioner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    @Test
    public void acCanBeTurnedOnTest (){
        AirConditioner lg = new AirConditioner("LG ac");
        assertFalse(lg.isOn());
        lg.turnOn();
        assertTrue(lg.isOn());

    }
    @Test
    public void acCanBeTurnedOffTest (){
        AirConditioner lg = new AirConditioner("LG ac");
        assertFalse(lg.isOn());
    }
@Test
    public void acTemperatureCanIncreasedTest (){
        AirConditioner lg = new AirConditioner("LG ac");
        lg.turnOn();
        assertTrue(lg.isOn());
        int currentTemperature = lg.getTemperature();
        assertEquals(16, currentTemperature);
        lg.increaseTemperature();
        lg.increaseTemperature();
        currentTemperature = lg.getTemperature();
        assertEquals(17,currentTemperature);

    }


}
