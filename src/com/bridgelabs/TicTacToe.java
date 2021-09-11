package com.bridgelabs;

public class TicTacToe {

    static  char[] board = new char[10];

    public static char[]  creatingBoard() {


        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
        return board;

    }

    public static void main(String args[]) {

        System.out.println("Welcome to TicTacToe Board Game");
        board = creatingBoard();
    }
}
