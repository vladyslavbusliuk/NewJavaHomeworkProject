package app;

public class MainAppB extends MainApp {
    public MainAppB(double stake) {
        super(stake);
    }

    @Override
    public double calculateWinning(int diceRoll) {
        double winnings = 1.25 * stake;
        double fee = 0.05 * stake;
        return winnings - fee;
    }
}

