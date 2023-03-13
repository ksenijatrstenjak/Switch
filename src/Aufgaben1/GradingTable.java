package Aufgaben1;
/*Grading Table

        Create a new class “GradingTable”.
        Write a static method to find the correct grade for the points received.
public static String getGrade(int points) { … }
        Use this table:


        Call your method in the main method with different results, printing them to the console. */



public class GradingTable {
    public static void main(String[] args) {
System.out.println(getGrade(66));
System.out.println(getGrade(92));
System.out.println(getGrade(10));


    }
    public static String getGrade (int points) {
        if (points >= 90) {
            return "Outstanding";
        } else if (points >= 78) {
            return "Excellent";
        } else if (points >= 65) {
            return "Acceptable";
        } else if (points >= 51) {
            return "Passing";
        } else {
            return "Fail";
        }
    }
    }

