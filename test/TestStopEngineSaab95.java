package test;
import org.junit.*;
import src.Saab95;
//import src.Car;
//import static org.junit.Assert.assertTrue;
//testar om jag kan pusha 

public class TestStopEngineSaab95 {
    @Test
    public void StopEngineSaab95(){
        Saab95 Saab = new Saab95();
        Saab.stopEngine();
        Assert.assertEquals(0, (int)Saab.getCurrentSpeed());
    }
    
}
