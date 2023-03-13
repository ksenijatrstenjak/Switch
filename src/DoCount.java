public class DoCount {
    public static void main(String[] args) {

        int startingNumber = 1;
        doCount(startingNumber);
}

public static void doCount (int startingNumber) {
        do {
            System.out.println(startingNumber);
            startingNumber++;
        } while (startingNumber <= 5);
}
}
