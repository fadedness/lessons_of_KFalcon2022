package lesson10;

public class Task1Drawer {
    final String horizontalSymbol;
    final String verticalSymbol;
    final String fillerSymbol;

    public Task1Drawer(String horizontalSymbol, String verticalSymbol, String fillerSymbol) {
        this.horizontalSymbol = horizontalSymbol;
        this.verticalSymbol = verticalSymbol;
        this.fillerSymbol = fillerSymbol;
    }

    public String drawRectangle(int length, int width) {
        String horizontalLine = createHorizontalLine(length);
        String verticalLines = createVerticalLines(length, width);

        return horizontalLine + verticalLines + horizontalLine;
    }

    private String createHorizontalLine(int length) {
        String horizontalLine = "";

        horizontalLine += fillerSymbol.repeat(this.verticalSymbol.length());

        for (int i = 0; i < length; i++) {
            horizontalLine += this.horizontalSymbol;
        }

        horizontalLine += fillerSymbol.repeat(this.verticalSymbol.length()) + "\n";

        return horizontalLine;
    }

    private String createVerticalLines(int length, int width) {
        String verticalLinesUnit = getVerticalLinesUnit(length);

        String verticalLines = "";

        for (int i = 0; i < width; i++) {
            verticalLines += verticalLinesUnit;
        }

        return verticalLines;
    }

    private String getVerticalLinesUnit(int length) {
        String verticalLinesUnit = this.verticalSymbol;

        for (int i = 0; i < length; i++) {
            verticalLinesUnit += fillerSymbol.repeat(this.horizontalSymbol.length());
        }

        verticalLinesUnit += this.verticalSymbol + "\n";

        return verticalLinesUnit;
    }
}
