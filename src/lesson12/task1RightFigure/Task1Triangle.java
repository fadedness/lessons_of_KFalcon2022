package lesson12.task1RightFigure;

public class Task1Triangle extends Task1RightFigure{
    final String horizontalSymbol;
    final String horizontalAltSymbol;
    final String leftVerticalSymbol;
    final String rightVerticalSymbol;

    public Task1Triangle(int length) {
        super(length, 3);
        //удваеваем символ для горизонтальной линии, чтобы выглядело нормально
        this.horizontalSymbol = symbolDash.repeat(2);
        this.horizontalAltSymbol = symbolGround.repeat(2);
        this.leftVerticalSymbol = symbolSlash;
        this.rightVerticalSymbol = symbolBackSlash;
    }

    @Override
    public void draw() {
        //drawTopUp();
        drawTopDown();
    }

    public void drawTopDown() {
        String figurePrint = "";
        String topHorizontalLine = getTopHorizontalLine();

        figurePrint += topHorizontalLine + "\n";
        for (int i = length-1; i >= 0; i--) {
            figurePrint += getMiddleHorizontalAltLine(i) + "\n";
        }

        System.out.println(figurePrint);
    }

    public void drawTopUp() {
        String figurePrint = "";
        String bottomHorizontalLine = getBottomHorizontalLine();

        for (int i = 0; i < length; i++) {
            figurePrint += getMiddleHorizontalLine(i) + "\n";
        }
        figurePrint += bottomHorizontalLine;

        System.out.println(figurePrint);
    }

    private String getBottomHorizontalLine() {
        String horizontalLine = "";

        for (int i = 0; i < length; i++) {
            horizontalLine += horizontalSymbol;
        }

        return horizontalLine;
    }

    private String getMiddleHorizontalLine(int offsetFromMiddle) {
        String horizontalLine = "";
        int emptySpaces = length - offsetFromMiddle - 1;

        horizontalLine += " ".repeat(emptySpaces);
        horizontalLine += leftVerticalSymbol;
        horizontalLine += " ".repeat(offsetFromMiddle);

        horizontalLine += " ".repeat(offsetFromMiddle);
        horizontalLine += rightVerticalSymbol;
        horizontalLine += " ".repeat(emptySpaces);

        return horizontalLine;
    }

    private String getTopHorizontalLine() {
        String horizontalLine = "";

        for (int i = 0; i < length; i++) {
            horizontalLine += "__";//horizontalAltSymbol;
        }

        return horizontalLine;
    }

    private String getMiddleHorizontalAltLine(int offsetFromMiddle) {
        String horizontalLine = "";
        int emptySpaces = length - offsetFromMiddle - 1;

        horizontalLine += " ".repeat(emptySpaces);
        horizontalLine += rightVerticalSymbol;
        horizontalLine += " ".repeat(offsetFromMiddle);

        horizontalLine += " ".repeat(offsetFromMiddle);
        horizontalLine += leftVerticalSymbol;
        horizontalLine += " ".repeat(emptySpaces);

        return horizontalLine;
    }
}
