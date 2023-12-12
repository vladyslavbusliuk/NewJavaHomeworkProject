package app;

public class MainAppA extends MainApp {
    public MainAppA(double stake) {
        super(stake);
    }

    @Override
    public double calculateWinning(int diceRoll) {
        return 1.25 * stake;
    }
}
