package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;

import java.awt.*;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }
}
