package chess;

import boardgame.Board;

public class ChessMatch {

    private Board board;

    public ChessMatch(){
        board = new Board(8, 8);
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRow()][board.getColumn()];
        for(int i=0; i < board.getRow(); i++){
            for(int y=0; y < board.getColumn(); y++){

            }
        }
        return mat;
    }
}