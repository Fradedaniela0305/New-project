package test.simulationtest;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

import Sandbox.Simulation.Cell;
import Sandbox.Simulation.CellState;
import Sandbox.Simulation.Grid;


public class GridTest {
    private Grid testGrid;


    @BeforeEach
    void runBeforeEach() {
        testGrid = new Grid(100);
    
    }

    @Test 
    void test_constructor() {
        assertEquals(testGrid.getSize(), 100);
        assertEquals(testGrid.getCells().size(), 0);
    }

    @Test
    void testAddCell() {
        Cell testCell1 = new Cell(1,1);
        testGrid.addCell(testCell1);
        assertEquals(testGrid.getCells().size(), 1);
        Cell testCell2 = new Cell(0,0);
        testGrid.addCell(testCell2);
        assertEquals(testGrid.getCells().size(), 2);
        testGrid.addCell(testCell2);
        assertEquals(testGrid.getCells().size(), 2);
    }

}
