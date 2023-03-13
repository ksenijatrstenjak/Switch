package Arrays;

public class ArrayLottery {
    public static void main(String[] args) {
        int[] myLotteryGuesses = new int[6];
        myLotteryGuesses[0] = 7;
        myLotteryGuesses[1] = 15;
        myLotteryGuesses[2] = 5;
        myLotteryGuesses[3] = 6;
        myLotteryGuesses[4] = 13;
        myLotteryGuesses[5] = 3;


        int [] winningNumbers = getRandomLotteryNumbers();
        int countMatches = 0;
        for(int i = 0; i < myLotteryGuesses.length; i++) {
            if (myLotteryGuesses [i] == winningNumbers [i]) {
            countMatches++;
            }
        }

if (countMatches == 6) {
    System.out.println("Jackpot!");
} else if ( countMatches == 5) {
    System.out.println("Second prize!");
} else if ( countMatches == 4) {
    System.out.println("Third prize!");

} else {
    System.out.println("You lost!");
}

    }
    public static int[] getRandomLotteryNumbers() {
        int[] randomNumbers = new int[6];
        for (int i =0; i<randomNumbers.length; i++) {
            int number = (int)  (Math.random() * 100);
            while (number > 49 || number == 0) {
                number = (int)  (Math.random() * 100);
            }
            randomNumbers[i] = number;
        }
        return randomNumbers;
    }
}
