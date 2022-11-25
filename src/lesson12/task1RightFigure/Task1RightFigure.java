package lesson12.task1RightFigure;

public class Task1RightFigure {
    public final int length;
    public final int sides;

    final String symbolDash = "-";
    final String symbolGround = "_";
    final String symbolPipe = "|";
    final String symbolSlash = "/";
    final String symbolBackSlash = "\\";

    Task1RightFigure(int length, int sides) {
        this.length = length;
        this.sides = sides;
    }

    public void draw() {
        System.out.println("");
    }
}
