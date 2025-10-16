package Sandbox.Simulation;

public class Cell {

    private int state;  // 1 for alive, 0 for dead
    private int nextState;
    private int row;
    private int col;

    public Cell(int row, int col) {
        this.state = 1;
        this.row = row;
        this.col = col;
    }


    // EFFECTS: Computes the next state of this cell
    public int computeNextState() {
        return -1;
    }

    // MODIFIES: THIS
    // EFFECTS: Changes current state of this cell
    public int changeState() {
        return -1;
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

    public int getState() {
        return this.state;
    }

    public int getNextState() {
        return this.nextState;
    }






}
