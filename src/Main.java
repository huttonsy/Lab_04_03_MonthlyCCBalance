public class Main {
    public static void main(String[] args) {
       double ccBalance = 5000;
       double interestRate = 0.17;
       double interestDue = (ccBalance * interestRate) + ccBalance;
       System.out.println("The interest due after one month is: $" + interestDue);
        System.out.println("The interest due after two months is: $" + ((ccBalance * (interestRate * 2) + ccBalance )));
    }
}