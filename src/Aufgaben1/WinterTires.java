package Aufgaben1;

/*WinterTires
Create a new class named "WinterTires". Write a static method to determine whether winter tires should be used:
public static boolean needWinterTires (int temperature, boolean slipperyRoad) { ... }
Winter tires should be used if:
•	Temperature < 10°C and the road is slippery.
•	Temperature < 4°C
Call the method in the main program using different values, and depending on the return, write the text "Please use winter tires" or
 "Winter tires are not required" and check if your results make sense.
*/

public class WinterTires {
    public static void main(String[] args) {
        boolean situation1 = needWinterTires(1, true); // should be true
        boolean situation2 = needWinterTires(15, true); // should be false
        boolean situation3 = needWinterTires(10, true); // should be false
        boolean situation4 = needWinterTires(3, false); // should be true


        printTireWarning(situation1);
        printTireWarning(situation2);
        printTireWarning(situation3);
        printTireWarning(situation4);

    }
    public static boolean needWinterTires (int temperature, boolean slipperyRoad){
        if (temperature < 4) {
            return true;
        } else if (temperature < 10 && slipperyRoad) {
            return true;
        } else return false;
    }
    public static void printTireWarning (boolean needWinterTires) {
        if (needWinterTires) {
            System.out.println("Please use winter tires");
        } else {
            System.out.println("Winter tires are not required");
        }
    }
}