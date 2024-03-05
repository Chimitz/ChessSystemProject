package boardgame;
public class Piece {
    /// Position is not the final chess position, it's a matrix position;
    /// Set protected makes it not accessible by the Chess Package;
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
    }


    /// Board must be only accessed by the classes in its package or subclasses;
    /// Set protected makes it not accessible by the Chess Package;
    protected Board getBoard() {
        return board;
    }
}
