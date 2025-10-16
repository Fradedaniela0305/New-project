package Sandbox.Simulation;


import java.util.ArrayList;
import java.util.List;

public class Grid {
    private List<Cell> cells;  // REpresents all cells living within the grid
    private Rules rules; // Represents the rules enforced by the grid
    private int size; // Represents the size of the grid
    
    public Grid(int size) {
        this.cells = generateCells(size);
        this.size = size;
        this.rules = new Rules();
    }
    

    // EFFECTS: Generates cells, all with DEAD as initial state
    public ArrayList<Cell> generateCells(int size) {
        return null;
    }

    // MODIFIES: THIS
    // EFFECTS: Changes the state of each cell
    public void changeStates() {
    }
    
    // MODIFIES: THIS
    // EFFECTS: Computes the next states of each of the cells based on the current rules
    public void computeNextStates() {

    }

    public List<Cell> getCells() {
        return this.cells;
    }

    public int getSize() {
        return this.size;
    }



}
