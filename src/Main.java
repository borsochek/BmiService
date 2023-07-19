public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        int myBmi = (int) service.calculate(57, 1.72);
        System.out.println(myBmi);
    }
}