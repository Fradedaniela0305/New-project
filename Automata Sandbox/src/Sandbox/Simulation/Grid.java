package Sandbox.Simulation;


import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Grid {
    private Set<Cell> liveCells = new HashSet<>();  // Represents all cells living within the grid
    private Rules rules; // Represents the rules enforced by the grid
    private int size; // Represents the size of the grid
    
    public Grid(int size) {
        this.liveCells = new HashSet<>();
        this.size = size;
        this.rules = new Rules();
    }
    
    // MODIFIES: THIS
    // EFFECTS: Adds a cell to the list of live cells
    public void addCell(Cell newCell) {
        liveCells.add(newCell);
    }
 


    // MODIFIES: THIS
    // EFFECTS: Remove cell from list of living cells
    public void removeCell(Cell cell) {
        liveCells.remove(cell);

    }


    // MODIFIES: THIS
    // EFFECTS: Changes the state of each cell
    public void changeStates() {

    }
    
    // MODIFIES: THIS
    // EFFECTS: Computes the next states of each of the cells based on the current rules
    public void computeNextStates() {

    }

    public Set<Cell> getCells() {
        return this.liveCells;
    }

    public int getSize() {
        return this.size;
    }

    public Rules getRules() {
        return this.rules;
    }



}
