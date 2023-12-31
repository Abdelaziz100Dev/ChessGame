package model.Exceptions;

public class inValidMoveException extends Exception{

    public static final  String PAWN = "\n pawn piece can move just one piece forward OR two at max if it's the first move ?";
    public static final  String KNIGHT = "\n invalid move for the Knight ?";
    public static final  String ROOK = "\n invalid move for the Rook piece ?";
    public static final  String BISHOP = "\n invalid move for the Bishop piece ?";
    public static final  String KING = "\n invalid move for the King piece ?";
    public static final  String QUEEN = "\n invalid move for the Queen piece ?";
    public static final  String PIECE = "\n invalid move Order for the piece ?";

    public inValidMoveException(String message){super(message);}

}
