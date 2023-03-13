package Wiederholen;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie ein wie Hoch die Geschwiendigkeit war: ");
        int geschwindigkeit = scanner.nextInt();
        int ueberschreitung = geschwindigkeit - 50;

        double strafe = 0;

    if ( ueberschreitung <= 0 ){

        System.out.println(" Gute Fahrt ");
    } else if ( ueberschreitung <= 10 ){
        System.out.println(" Schriftliche Verwarnung ");

    } else if ( ueberschreitung <= 20 ){
        System.out.println(" Die Ueberschreitung betraegt " + ueberschreitung + " es werden 30 Euro faellig! ");
        strafe = strafe + 30;
    } else if ( ueberschreitung <= 30 ) {
        System.out.println (" Die Ueberschreitung betraegt " + ueberschreitung + " es werden 50 Euro faellig! ");
        strafe = strafe + 50;
    } else if ( ueberschreitung <= 50) {
        System.out.println (" Die Ueberschreitung betraegt " + ueberschreitung + " es werden 100 Euro faellig! ");
        strafe = strafe + 100;
    } else if ( ueberschreitung <= 100 ) {
        System.out.println (" Die Ueberschreitung betraegt " + ueberschreitung + " es werden 500 Euro faellig! ");
        strafe = strafe + 500;
    } else if ( ueberschreitung > 100) {
        System.out.println(" Die Ueberschreitung betraegt " + ueberschreitung + " es werden 1500 Euro faellig! ");
        strafe = strafe + 1500;
    }


    System.out.println("Geben Sie die Alkoholpegel ein:");
    double alkoholpegel = scanner.nextDouble();

    if (alkoholpegel <= 0) {
        System.out.println( " Alles in Ordnung!");
    } else if ( alkoholpegel <= 1.0) {
            System.out.println( " Die Alkoholpegel beträgt " + alkoholpegel + " es werden 50 Euro fällig!");
        strafe = strafe + 50;
        }
    else if ( alkoholpegel <= 2.0 ) {
        System.out.println( " Die Alkoholpegel beträgt " + alkoholpegel + " es werden 100 Euro fällig!");
        strafe = strafe + 100;
    }
    else if ( alkoholpegel  > 2.0 ) {
        System.out.println( " Die Alkoholpegel beträgt " + alkoholpegel + " es werden 2500 Euro fällig!");
        strafe = strafe + 2500;
    }

    if (strafe >= 0) {
        System.out.println( "Die finale Strafe beträgt: " + strafe + " Euro!");
    } else {
        System.out.println("Alles in Ordnung - weiterfahren!");
    }
    } }
