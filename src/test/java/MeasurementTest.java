import org.junit.Assert;
import org.junit.Test;

public class MeasurementTest {
    @Test
    public void shouldVerifyIfFourFeetEqualsToFourFeet(){
        Measurement measurementOne = new Measurement(4,"ft");
        Measurement measurementTwo = new Measurement(4,"ft");
        Assert.assertEquals(measurementOne,measurementTwo);
    }
    @Test
    public void shouldVerifyIfFourFeetNotEqualToFiveFeet(){
        Measurement measurementOne = new Measurement(4,"ft");
        Measurement measurementTwo = new Measurement(5,"ft");
        Assert.assertNotEquals(measurementOne,measurementTwo);
    }
    @Test
    public void shouldVerifyIfFourInchEqualsToFourInch(){
        Measurement measurementOne = new Measurement(4,"inch");
        Measurement measurementTwo = new Measurement(4,"inch");
        Assert.assertEquals(measurementOne,measurementTwo);
    }
    @Test
    public void shouldVerifyIfFourFeetNotEqualToFourInch(){
        Measurement measurementOne = new Measurement(4,"ft");
        Measurement measurementTwo = new Measurement(4,"inch");
        Assert.assertNotEquals(measurementOne,measurementTwo);
    }

}
