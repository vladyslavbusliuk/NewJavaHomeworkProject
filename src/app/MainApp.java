package app;
import java.util.Scanner;

public class MainApp {
    double stake;

    public MainApp(double stake) {
        this.stake = stake;
    }

    public double calculateWinning(int diceRoll) {
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter dice roll: ");
        int diceRoll = scanner.nextInt();

        System.out.print("Enter stake: ");
        double stake = scanner.nextDouble();

        if (diceRoll < 3) {
            MainAppA mainA = new MainAppA(stake);
            System.out.println("Result A: " + mainA.calculateWinning(diceRoll));
        } else if (diceRoll >= 3 && diceRoll <= 7) {
            MainAppB mainB = new MainAppB(stake);
            System.out.println("Result B: " + mainB.calculateWinning(diceRoll));
        } else {
            MainAppC mainC = new MainAppC(stake);
            System.out.println("Result C: " + mainC.calculateWinning(diceRoll));
        }

        System.out.println("Program finished successfully.");
    }
}
