import java.util.Objects;

public class Measurement {
    double value;
    String type;

    public Measurement(double value, String type) {
        this.value = value;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Measurement)) return false;
        Measurement that = (Measurement) o;
        return Double.compare(that.value, value) == 0 &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, type);
    }
}
