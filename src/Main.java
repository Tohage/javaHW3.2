//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Рассчет индекса массы тела");
        BmiService service = new BmiService();
        int weighKG = 98;
        double heightMeter = 1.87;
        double bmi = service.calculate(weighKG, heightMeter);
        System.out.println("Индекс массы тела = " + bmi);

    }
}