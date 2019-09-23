package com.cjhoward92.nqueens;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    List<Queen> queens;

    public Solution(Stack<Queen> queens) {
        this.queens = new ArrayList<>();
        for (Queen q : queens)
            this.queens.add(q);
    }

    public void print() {
        for (int i = 0; i < queens.size(); i++) {
            for (int j = 0; j < queens.size(); j++) {
                char q = '-';

                Queen queen = queens.get(i);
                if (queen.col == j) q = 'Q';

                System.out.print(String.format("   %s", q));
            }
            System.out.println();
        }

        System.out.println();
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

        for (Queen q : queens)
            hash = prime * hash + q.hashCode();
        
        return hash;
    }
}