public class BmiService {

    public double calculate(double m, double h) {

        int result;
        result = (int) (m / (h * h));
        return result;

    }
}
