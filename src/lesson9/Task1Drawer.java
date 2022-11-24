package lesson9;

import java.util.Scanner;

public class Task1Drawer {
    final Scanner scanner = new Scanner(System.in);
    final String horizontalSymbol;
    final String verticalSymbol;

    public Task1Drawer(String horizontalSymbol, String verticalSymbol) {
        this.horizontalSymbol = horizontalSymbol;
        this.verticalSymbol = verticalSymbol;
    }

    public void DrawRectangle() {
        int length = requireInt("Enter rectangle's length: ");
        int width = requireInt("Enter rectangle's width: ");

        scanner.close();

        String horizontalLine = createHorizontalLine(length);
        String verticalLines = createVerticalLines(length, width);

        printRectangle(horizontalLine, verticalLines);
    }
    private int requireInt(String requiringMessage) {
        System.out.print(requiringMessage);

        return scanner.nextInt();
    }

    private void printRectangle(String horizontalLine, String verticalLines) {
        System.out.print(horizontalLine + verticalLines + horizontalLine);
    }

    private String createHorizontalLine(int length) {
        String horizontalLine = "";

        horizontalLine += " ".repeat(this.verticalSymbol.length());

        for (int i = 0; i < length; i++) {
            horizontalLine += this.horizontalSymbol;
        }

        horizontalLine += " \n";

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
            verticalLinesUnit += " ".repeat(this.horizontalSymbol.length());
        }

        verticalLinesUnit += this.verticalSymbol + "\n";
        return verticalLinesUnit;
    }
}
