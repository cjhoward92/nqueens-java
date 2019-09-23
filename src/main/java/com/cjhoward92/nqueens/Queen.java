package com.cjhoward92.nqueens;

public class Queen {
    int row;
    int col;

    public Queen(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public boolean canAttack(Queen queen) {
        if (queen.row == row) return true;
        if (queen.col == col) return true;

        int rowDiff = Math.abs(row - queen.row);
        int colDiff = Math.abs(col - queen.col);
        if (rowDiff == colDiff) return true;

        return false;
    }

    public String dimensionsString() {
        return String.format("[%d, %d]", row, col);
    }

    @Override
    public boolean equals(Object obj) { 
        if(this == obj) 
            return true; 

        if(obj == null || obj.getClass() != this.getClass()) 
            return false; 
        
        return hashCode() == obj.hashCode();
    } 
      
    @Override
    public int hashCode() { 
        int prime = 101;
        int hash = 1;

        hash = prime * hash + row;
        hash = prime * hash + col;
        return hash;
    }
}