package model;

import java.util.Scanner;

public class Game {
    public Board board;
    public  boolean isGameOver;
    public  boolean isBlackTurn;
    public Scanner sc;

    public Game(Board board) {
        super();
        this.board = board;
       // gameInAction = true;
        //turn = 0;
        //validMoves = new ArrayList<>();

    }
    public void play() {


        System.out.println("\nThis is the board of your chess game:\n");
        board.printTheBoard();
      //  printHelp();

        while (isGameOver) {
          //  if(board.isKingCaptured == true)
            //{
             //   break;
            //}

            if (isBlackTurn) {
                System.out.print("\nWhite plays. Please insert your move: ");
            } else {
                System.out.print("\nBlack plays. Please insert your move: ");
            }

            String move= sc.nextLine();
            handelMove(move);
        }

    }
    public void handelMove(String move){
        // export from and to
        //Location loc = board;




    }
}
