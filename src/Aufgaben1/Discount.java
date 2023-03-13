package Aufgaben1;

public class Discount {
    public static void main(String[] args) {
        //How much can Edna (a senior citizen), her dog Lola, and her grandson Paul save if they take the bus in both directions and
        // buy a fiction (for 15 and 18 Euros) and a non-fiction (for 23 and 28 Euros) book each?
        //Write the results to the console.

        boolean isSenior = true;
        boolean isDog = false;
        boolean isStudent = false;
        double busTicketPrice = 3.2;

        double busPriceEdna = 2 * getBusDiscount(isSenior, isDog, isStudent, busTicketPrice);

        double busPriceLola = 2 * getBusDiscount(false, true, false, busTicketPrice);

        double busPricePaul = 2 * getBusDiscount(false, false, true, busTicketPrice);

        double bookTotalPrice = 15 + 18 + 23 + 28;
        double bookPriceAfterDiscount = getBookDiscount(2, 2, bookTotalPrice);

        double fullPriceForEverything = 3.2 * 6 + bookTotalPrice;
        double discountedPriceForEverything = bookPriceAfterDiscount + busPriceEdna + busPriceLola + busPricePaul;

        System.out.println("Edna, Lola and Paul save " +  (fullPriceForEverything - discountedPriceForEverything) + " Euros.");
    }

    public static double getBusDiscount(boolean isSenior, boolean isDog, boolean isStudent, double busTicketPrice) {
        double discountedPrice;
        if (isSenior) {
            discountedPrice = busTicketPrice * 0.85;
        } else if (isDog) {
            discountedPrice = busTicketPrice * 0.8;
        } else if (isStudent) {
            discountedPrice = busTicketPrice * 0.9;
        } else {
            discountedPrice = busTicketPrice;
        }
        return discountedPrice;
    }

    public static double getBookDiscount(int fiction, int nonFiction, double fullPrizeOfAllBooks) {
        double reducedPrice;
        if (nonFiction > 2 && fiction >= 1) {
            reducedPrice = fullPrizeOfAllBooks * 0.9;
        } else {
            reducedPrice = fullPrizeOfAllBooks;
        }
        return reducedPrice;


    }
}
