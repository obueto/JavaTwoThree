package automaticBike;

import chapterSix.AutomaticBike;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {
    Bike automaticBike;
    @BeforeEach
    public void setUp(){
        automaticBike = new Bike();
    }
    @Test
    public void bikeIsOffTest(){
        assertFalse(automaticBike.isOn());
    }
    @Test
    public void bikeTurnOnTest(){
        assertFalse(automaticBike.isOn());
        automaticBike.turnOn();
        assertTrue(automaticBike.isOn());
    }
    @Test
    public void bikeCanBeTurnedOffTest(){
        assertFalse(automaticBike.isOn());
        automaticBike.turnOn();
        assertTrue(automaticBike.isOn());
        automaticBike.turnOff();
        assertFalse(automaticBike.isOn());
    }
    @Test
    public void bikeCanAccelerateOnGearOneTest(){
        assertFalse(automaticBike.isOn());
        automaticBike.turnOn();
        assertTrue(automaticBike.isOn());
        automaticBike.accelerate(1);
        assertEquals(1,automaticBike.getSpeed());
    }
    @Test
    public void bikeCanAccelerateAtGearTwo(){
        assertFalse(automaticBike.isOn());
        automaticBike.turnOn();
        assertTrue(automaticBike.isOn());
        automaticBike.accelerate(2);
        assertEquals(2,automaticBike.getSpeed());
    }
    @Test
    public void bikeCanAccelerateAtGearThree(){
        assertFalse(automaticBike.isOn());
        automaticBike.turnOn();
        assertTrue(automaticBike.isOn());
        automaticBike.accelerate(3);
        assertEquals(3,automaticBike.getSpeed());
    }
    @Test
    public void bikeCanAccelerateAtGearFour(){
        assertFalse(automaticBike.isOn());
        automaticBike.turnOn();
        assertTrue(automaticBike.isOn());
        automaticBike.accelerate(4);
        assertEquals(4,automaticBike.getSpeed());
    }
    @Test
    public void bikeCanDecelerateAtGearOne(){
        automaticBike.turnOn();
        assertTrue(automaticBike.isOn());
        for (int i = 0; i < 4; i++){
            automaticBike.accelerate(1);
        }
        assertEquals(4,automaticBike.getSpeed());
        automaticBike.decelerate(1);
        assertEquals(3,automaticBike.getSpeed());
    }
    @Test
    public void bikeCanDecelerateAtGearTwo(){
        automaticBike.turnOn();
        assertTrue(automaticBike.isOn());
        for (int i = 0; i < 4; i++){
            automaticBike.accelerate(2);
        }
        assertEquals(8,automaticBike.getSpeed());
        automaticBike.decelerate(2);
        assertEquals(6,automaticBike.getSpeed());
    }
    @Test
    public void bikeCanDecelerateAtGearThree(){
        automaticBike.turnOn();
        assertTrue(automaticBike.isOn());
        for (int i = 0; i < 4; i++){
            automaticBike.accelerate(3);
        }
        assertEquals(12,automaticBike.getSpeed());
        automaticBike.decelerate(3);
        assertEquals(9,automaticBike.getSpeed());
    }

    @Test
    public void bikeCanDecelerateAtGearFour(){
        automaticBike.turnOn();
        assertTrue(automaticBike.isOn());
        for (int i = 0; i < 4; i++){
            automaticBike.accelerate(4);
        }
        assertEquals(16,automaticBike.getSpeed());
        automaticBike.decelerate(4);
        assertEquals(12,automaticBike.getSpeed());
    }
    @Test
    public void speedChangesInGearOneTest(){
        automaticBike.turnOn();
        assertTrue(automaticBike.isOn());
        for (int i = 0; i < 20; i++){
            automaticBike.accelerate(1);
        }
        assertEquals(automaticBike.getGear(),1);
    }
    @Test
    public void speedChangesInGearTwoTest(){
        automaticBike.turnOn();
        assertTrue(automaticBike.isOn());
        for (int i = 0; i < 12; i++){
            automaticBike.accelerate(2);
        }
        assertEquals(automaticBike.getGear(),2);
    }
    @Test
    public void speedChangesInGearThreeTest(){
        automaticBike.turnOn();
        assertTrue(automaticBike.isOn());
        for (int i = 0; i < 12; i++){
            automaticBike.accelerate(3);
        }
        assertEquals(automaticBike.getGear(),3);
    }
    @Test
    public void speedChangesInGearFourTest(){
        automaticBike.turnOn();
        assertTrue(automaticBike.isOn());
        for (int i = 0; i < 12; i++){
            automaticBike.accelerate(4);
        }
        assertEquals(automaticBike.getGear(),4);
    }

}
