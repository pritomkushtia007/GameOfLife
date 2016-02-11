package com.sarwar.gameoflife.model.base;

import com.sarwar.gameoflife.enums.CellState;
import com.sarwar.gameoflife.observer.Observer;

import java.util.ArrayList;
import java.util.List;


public abstract class BaseCell {

    private String cellSymbol;

    private CellState currentState;


    // Constructor
    public BaseCell(CellState currentState, String cellSymbol) {
        this.currentState = currentState;
        this.cellSymbol = cellSymbol;


    }

    public String getCellSymbol() {
        return cellSymbol;
    }

    public CellState getCurrentState() {
        return currentState;
    }


    /**
     *
     * @param liveNeighbourCount Live Neighbour cell Count
     * @return <b>true</b> if cell is live in next generation
     * <br/> <b>false</b> if cell is dead in next generation
     *
     */
    public abstract boolean applyRuleForNextGeneration(int liveNeighbourCount);

}
