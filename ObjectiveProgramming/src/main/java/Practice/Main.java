package Practice;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Jan","Kowalski", 3000);
        double nettoYearPayment = PaymentCalculator.nettoYearPayment(employee);
        double bruttoYearPayment = PaymentCalculator.bruttoYearPayment(employee);
        System.out.println("Year salary netto: " + nettoYearPayment);
        System.out.println("Year salary brutto: " + bruttoYearPayment);
    }
}
