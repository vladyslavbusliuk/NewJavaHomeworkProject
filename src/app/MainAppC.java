package app;

public class MainAppC extends MainApp {
    public MainAppC(double stake) {
        super(stake);
    }

    @Override
    public double calculateWinning(int diceRoll) {
        double baseWinnings = 2 * stake;
        double fee = 0.1 * baseWinnings;
        return baseWinnings - fee;
    }
}
