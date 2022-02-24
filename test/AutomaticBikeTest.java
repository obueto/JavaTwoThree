import chapterSix.AutomaticBike;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AutomaticBikeTest {

    @Test
    public void bikeCanBeTurnedOnTest () {
        AutomaticBike suzuki = new AutomaticBike("Suzuki");
        suzuki.turnOn();
        assertTrue(suzuki.isOn());
    }
    @Test
    public void bikeCanBeTurnedOffTest (){
        AutomaticBike suzuki = new AutomaticBike( "Suzuki");
        suzuki.turnOff();
        assertTrue(suzuki.isOff());
    }
    @Test
    public void bikeCanBeAcceleratedInGearOneTest () {
        AutomaticBike suzuki = new AutomaticBike( "Suzuki");
        suzuki.turnOn();
        assertTrue(suzuki.isOn());
        for (int i = 1; i  < 20; i++){
            suzuki.accelerate(1);
        }


       suzuki.getSpeed();
        assertEquals(38,suzuki.getSpeed());


    }
    @Test
    public void bikeCanBeAcceleratedInGearTwo(){
        AutomaticBike suzuki = new AutomaticBike("Suzuki");
        suzuki.turnOn();
        assertTrue(suzuki.isOn());
        for (int i = 1; i < 21; i++){
            suzuki.accelerate(2);
        }

        assertEquals(55,suzuki.getSpeed());
    }
    @Test
    public void bikeCanBeAcceleratedInGearThree(){
        AutomaticBike suzuki = new AutomaticBike("Suzuki");
        suzuki.turnOn();
        assertTrue(suzuki.isOn());
        suzuki.accelerate(3);
        assertEquals(18,suzuki.getSpeed());
    }
    @Test
    public void bikeCanBeAcceleratedToGearFour(){
        AutomaticBike suzuki = new AutomaticBike("Suzuki");
        suzuki.turnOn();
        assertTrue(suzuki.isOn());
        suzuki.accelerate(4);
        assertEquals(19,suzuki.getSpeed());
    }
    @Test
    public void bikeCanBeDecreasedToGearOneTest(){
        AutomaticBike suzuki = new AutomaticBike("Suzuki");
        suzuki.turnOn();
        assertTrue(suzuki.isOn());
        suzuki.decrease(1);
        assertEquals(14,suzuki.getSpeed());


    }
    @Test
    public void bikeCanBeDecreasedByGear2(){
        AutomaticBike suzuki = new AutomaticBike("Suzuki");
        suzuki.turnOn();
        assertTrue(suzuki.isOn());

        suzuki.decrease(2);
    assertEquals(13,suzuki.getSpeed());
    }

    @Test
    public void bikeCanBeDecreasedByGearThree(){
        AutomaticBike suzuki = new AutomaticBike("Suzuki");
        suzuki.turnOn();
        assertTrue(suzuki.isOn());

        suzuki.decrease(3);
        assertEquals(12, suzuki.getSpeed());

    }
    @Test
    public void bikeCanBeDecreasedByGearFour(){
        AutomaticBike suzuki = new AutomaticBike("Suzuki");
        suzuki.turnOn();
        assertTrue(suzuki.isOn());

        suzuki.decrease(4);
        assertEquals(11, suzuki.getSpeed());

    }

    @Test
    public void bikeCanUseGearOneTest(){
        AutomaticBike suzuki = new AutomaticBike("Suzuki");
        suzuki.turnOn();
        assertTrue(suzuki.isOn());
        suzuki.accelerate(4);
        assertEquals(19,suzuki.getSpeed());
        suzuki.setGear();
        assertEquals(1,suzuki.getGear());

    }
    @Test
    public void bikeCanUseGearTwoTest(){
        AutomaticBike suzuki = new AutomaticBike("Suzuki");
        suzuki.turnOn();
        assertTrue(suzuki.isOn());
        for (int i = 1; i < 3;i++)
        suzuki.accelerate(4);
        assertEquals(23,suzuki.getSpeed());
        suzuki.setGear();
        assertEquals(2,suzuki.getGear());

    }
@Test
    public void  bikeCanUseGearThreeTest(){
    AutomaticBike suzuki = new AutomaticBike("Suzuki");
    suzuki.turnOn();
    assertTrue(suzuki.isOn());
    for (int i = 1; i < 5;i++)
        suzuki.accelerate(4);
    assertEquals(31,suzuki.getSpeed());
    suzuki.setGear();
    assertEquals(3,suzuki.getGear());

}
    @Test
    public void  bikeCanUseGearFourTest(){
        AutomaticBike suzuki = new AutomaticBike("Suzuki");
        suzuki.turnOn();
        assertTrue(suzuki.isOn());
        for (int i = 1; i < 8;i++)
            suzuki.accelerate(4);
        assertEquals(43,suzuki.getSpeed());
        suzuki.setGear();
        assertEquals(4,suzuki.getGear());

    }

}
