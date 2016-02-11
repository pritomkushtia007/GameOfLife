package com.sarwar.gameoflife.model;

import com.sarwar.gameoflife.GameData;
import com.sarwar.gameoflife.enums.CellState;
import com.sarwar.gameoflife.model.base.BaseCell;


public class DeadCell extends BaseCell {

    private static DeadCell ref;

    public static DeadCell getInstance() {
        if (ref == null) {
            ref = new DeadCell();
        }
        return ref;
    }


    private DeadCell() {
        super(CellState.CELL_STATE_DEAD, GameData.getInstance().getDeadCellSymbol());


    }

    @Override
    public boolean applyRuleForNextGeneration(int liveNeighbourCount) {

        // Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.

        if (liveNeighbourCount == 3) {
            // by reproduction LIVE
            return true;
        } else {
            // stays  DEAD
            return false;
        }

    }
}
