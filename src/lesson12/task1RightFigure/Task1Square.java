package lesson12.task1RightFigure;

public class Task1Square extends Task1RightFigure{
    final String horizontalSymbol;
    final String verticalSymbol;

    public Task1Square(int length) {
        super(length, 4);
        this.horizontalSymbol = symbolDash;
        this.verticalSymbol = symbolPipe;
    }

    @Override
    public void draw() {
        String figurePrint = "";
        String horizontalLine = getHorizontalLine();
        String verticalLine = getVerticalLine();

        figurePrint += horizontalLine + "\n";
        for (int i = 0; i < length; i++) {
            figurePrint += verticalLine + "\n";
        }
        figurePrint += horizontalLine;

        System.out.println(figurePrint);
    }

    private String getHorizontalLine() {
        String horizontalLine = "";

        horizontalLine += " ";
        for (int i = 0; i < length; i++) {
            horizontalLine += horizontalSymbol;
        }
        horizontalLine += " ";

        return horizontalLine;
    }

    private String getVerticalLine() {
        String verticalLine = "";

        verticalLine += verticalSymbol;
        for (int j = 0; j < length; j++) {
            verticalLine += " ";
        }
        verticalLine += verticalSymbol;

        return verticalLine;
    }
}