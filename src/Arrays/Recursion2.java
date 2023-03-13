package Arrays;

public class Recursion2 {
    public static void main(String[] args) {
        printSentence("Hallo! Hilfe!", 0);


    }
    public static void printSentence(String sentence, int startingNumber) {

        if (startingNumber != 10) {
            System.out.println(sentence);
            startingNumber++;
            printSentence(sentence, startingNumber);
        } else {
            System.out.println("Finnished!");
        }
    }
}
