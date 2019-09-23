package com.cjhoward92.nqueens;

public class App
{
    public static void main(String[] args)
    {
        System.out.println("Setting up the game.");
        Chessboard board = new Chessboard(8);
        Solutions solutions = board.solve();
        solutions.print();
    }
}
