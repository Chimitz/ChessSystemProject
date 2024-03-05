package application;

import chess.ChessMatch;

public class Application {
    public static void main(String[] args) {

        ChessMatch match = new ChessMatch();

        UI.printBoard(match.GetPieces());

    }
}
