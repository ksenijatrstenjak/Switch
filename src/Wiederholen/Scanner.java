package Wiederholen;

public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Bitte geben Sie eine Nummer ein: ");
        int nummer = scanner.nextInt();
if (nummer > 5){
    System.out.println("Nummer ist groesser als 5!");
} else if (nummer < 5){
    System.out.println("Nummer ist kleiner als 5!");

} else {
    System.out.println("Nummer ist wohl gleich 5!");

}
    }
}
