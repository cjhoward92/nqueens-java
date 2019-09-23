package com.cjhoward92.nqueens;

import java.util.Stack;

public class Chessboard {
    private int dimension;
    private Stack<Queen> queens = new Stack<>();

    public Chessboard(int dimension) {
        if (dimension <= 0) {
            throw new IllegalArgumentException("Dimension must be a positive number");
        }

        this.dimension = dimension;
    }

    public Solutions solve() {
        Solutions solutions = new Solutions();

        int row = 0;
        int col = 0;
        while (row < dimension) {
            while (col < dimension) {
                Queen queen = new Queen(row, col);
                if (canPlaceQueen(queen)) {
                    queens.push(queen);
                    col = 0;

                    if (row + 1 == dimension && queens.size() == dimension){
                        solutions.add(new Solution(queens));
                        col = dimension;
                    }
                    break;
                }
                col++;
            }

            if (col >= dimension) {
                Queen lastQueen = queens.pop();
                row = lastQueen.row;
                col = lastQueen.col + 1;
                if (row == 0 && col == dimension)
                    break;

                continue;
            }

            row++;
        }

        return solutions;
    }

    private boolean canPlaceQueen(Queen queen) {
        for (Queen q : queens) {
            if (queen.canAttack(q)) return false;
        }
        return true;
    }
}