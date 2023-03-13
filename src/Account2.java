public class Account2 {
    public static void main(String[] args) {
        int years = 10;
        double investment = 2000;
        double interestRate = 0.025;
        // double interestRate = 102.2;

        calculateAccountBalance(years, investment, interestRate);

    }
   public static double calculateAccountBalance(int years, double investment, double interestRate) {
        double accountBalance = investment;
        for (int i = 1; i <= years; i++){
            //accountBalance=accountBalance/100*interestRate;
            accountBalance =accountBalance + (accountBalance * interestRate);
            System.out.println(accountBalance + " Euros in year " + i);
        }
        return  accountBalance;
   }

}
