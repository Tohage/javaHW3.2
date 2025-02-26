public class BmiService {
    public int calculate(int weighKG, double heightMeter) {
        double bmi = (weighKG/ (heightMeter * heightMeter));
        return (int) bmi;

    }
}
