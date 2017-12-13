import org.junit.Assert;
import org.junit.Test;

public class MeasurementTest {
    @Test
    public void shouldVerifyIfFourFeetEqualsToFourFeet() {
        Measurement measurementOne = new Measurement(4, MeasurementType.FEET);
        Measurement measurementTwo = new Measurement(4, MeasurementType.FEET);
        Assert.assertEquals(measurementOne, measurementTwo);
    }

    @Test
    public void shouldVerifyIfFourFeetNotEqualToFiveFeet() {
        Measurement measurementOne = new Measurement(4, MeasurementType.FEET);
        Measurement measurementTwo = new Measurement(5, MeasurementType.FEET);
        Assert.assertNotEquals(measurementOne, measurementTwo);
    }

    @Test
    public void shouldVerifyIfFourInchEqualsToFourInch() {
        Measurement measurementOne = new Measurement(4, MeasurementType.INCH);
        Measurement measurementTwo = new Measurement(4, MeasurementType.INCH);
        Assert.assertEquals(measurementOne, measurementTwo);
    }

    @Test
    public void shouldVerifyIfFourFeetEqualsToFourInch() {
        Measurement measurementOne = new Measurement(4, MeasurementType.FEET);
        Measurement measurementTwo = new Measurement(4, MeasurementType.INCH);
        Assert.assertNotEquals(measurementOne, measurementTwo);
    }

    @Test
    public void shouldVerifyIfOneFeetEqualsToTwelveInch() {
        Measurement measurementOne = new Measurement(1, MeasurementType.FEET);
        Measurement measurementTwo = new Measurement(12, MeasurementType.INCH);
        Assert.assertEquals(measurementOne, measurementTwo);
    }

    @Test
    public void shouldVerifyIfOneFeetNotEqualsToThirteenInch() {
        Measurement measurementOne = new Measurement(1, MeasurementType.FEET);
        Measurement measurementTwo = new Measurement(13, MeasurementType.INCH);
        Assert.assertNotEquals(measurementOne, measurementTwo);
    }

}
