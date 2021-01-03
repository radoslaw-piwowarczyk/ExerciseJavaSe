package Practice;

public class PaymentCalculator {

    private static final double MONTHLY_ZUS = 1000;

    public static double nettoYearPayment(Employee payment) {
        return payment.getSalary() * 12;
    }

    public static double bruttoYearPayment(Employee payment) {
        double nettoSalary = payment.getSalary();
        double tax = nettoSalary * 0.2;
        return 12 * (nettoSalary + tax + MONTHLY_ZUS);
    }
}
