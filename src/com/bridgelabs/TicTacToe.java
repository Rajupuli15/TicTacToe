package com.bridgelabs;

import java.util.Scanner;

public class TicTacToe {

    static  char[] board = new char[10];
    private static char cross ='X';
    private static char zero ='O';
    private static char player;
    private static char computer;
    public static char[]  creatingBoard() {


        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
        return board;
    }
    private static void allowPlayerToChoose()
    {
        System.out.println("Enter X or O you want to choose");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        player = input.charAt(0);

        if(player == cross)
        {
            player = cross;
            computer = zero;
            System.out.println("player symbol : " + player);

        }
        else if(player == zero)
        {
            player = zero;
            computer = cross;
            System.out.println("player symbol : " + player);

        }
        else
        {
            System.out.println("Invalid Character");
        }



    }


    public static void main(String args[]) {

        System.out.println("Welcome to TicTacToe Board Game");
        board = creatingBoard();

        allowPlayerToChoose();
    }
}
