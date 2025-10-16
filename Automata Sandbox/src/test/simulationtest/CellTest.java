package test.simulationtest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

import Sandbox.Simulation.Cell;

public class CellTest {
    private Cell testCell;

    @BeforeEach
    void runBeforeEach() {
        testCell = new Cell(1, 2);
    }


    @Test 
    void test_constructor() {
        assertEquals(testCell.getState(), 1);
        assertEquals(testCell.getRow(), 1);
        assertEquals(testCell.getCol(), 2);
    }

}
