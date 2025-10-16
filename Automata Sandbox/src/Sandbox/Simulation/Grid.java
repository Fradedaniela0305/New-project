package Sandbox.Simulation;


import java.util.ArrayList;
import java.util.List;

public class Grid {
    private List<Cell> cells;
    
    public Grid() {
        cells = new ArrayList<>();
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
        return cells;
    }



}
