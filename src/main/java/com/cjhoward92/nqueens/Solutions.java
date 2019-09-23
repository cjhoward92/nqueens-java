package com.cjhoward92.nqueens;

import java.util.ArrayList;
import java.util.List;

public class Solutions {
    List<Solution> solutions = new ArrayList<>();
    int totalCount = 0;

    public void add(Solution solution) {
        totalCount++;
        for (Solution s : solutions) {
            if (s.equals(solution)) return;
        }

        solutions.add(solution);
    }

    public void print() {
        for (Solution s : solutions)
            s.print();

        System.out.println(String.format("Solution count: %d - Unique count: %d", totalCount, solutions.size()));
    }
}