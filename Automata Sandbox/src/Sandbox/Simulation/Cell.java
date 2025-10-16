package Sandbox.Simulation;

public class Cell {

    private CellState state;  // 1 for alive, 0 for dead
    private CellState nextState;
    private int row;
    private int col;

    public Cell(int row, int col) {
        this.state = CellState.DEAD;
        this.row = row;
        this.col = col;
    }

    // MODIFIES: THIS
    // EFFECTS: Changes current state of this cell
    public void changeState() {

    }
    
    // EFFECTS: Changes the next state of the cell
    public void changeNextState() {

    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

    public CellState getState() {
        return this.state;
    }

    public CellState getNextState() {
        return this.nextState;
    }






}
