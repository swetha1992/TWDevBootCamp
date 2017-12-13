import java.util.Objects;

public class Measurement {

    private final double value;
    private final MeasurementType type;


    public Measurement(double value, MeasurementType type) {
        this.value = value;
        this.type = type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Measurement)) return false;
        Measurement that = (Measurement) o;
        return Double.compare(that.getInchValue(), getInchValue()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, type);
    }

    public double getInchValue() {
        if (type.equals(MeasurementType.INCH))
            return value;
        return value * 12;
    }

    public Measurement addMeasurements(Measurement measurement) {
        return new Measurement(this.getInchValue() + measurement.getInchValue(),MeasurementType.INCH);
    }
}

