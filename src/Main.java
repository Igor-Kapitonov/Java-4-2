public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate(80,1.79);
        System.out.println(bmi);
    }
}