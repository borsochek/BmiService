public class BmiService {

    public double calculate(double weight, double height) {

        int result;
        result = (int) (weight / (height * height));
        return result;

    }
}
