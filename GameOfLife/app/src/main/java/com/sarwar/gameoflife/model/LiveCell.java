package com.sarwar.gameoflife.model;

import com.sarwar.gameoflife.GameData;
import com.sarwar.gameoflife.enums.CellState;
import com.sarwar.gameoflife.model.base.BaseCell;


public class LiveCell extends BaseCell {

    private static LiveCell ref;

    public static LiveCell getInstance() {
        if (ref == null) {
            ref = new LiveCell();
        }
        return ref;
    }


    private LiveCell() {
        super(CellState.CELL_STATE_LIVE, GameData.getInstance().getLiveCellSymbol());


    }


    @Override
    public boolean applyRuleForNextGeneration(int liveNeighbourCount) {

        // 1) Any live cell with fewer than two live neighbours dies, as if caused by under-population.
        // 2) Any live cell with two or three live neighbours lives on to the next generation.
        // 3) Any live cell with more than three live neighbours dies, as if by overcrowding.

        if (liveNeighbourCount < 2) {
            // by under-population DEAD
            return false;
        } else if (liveNeighbourCount < 4) {
            // LIVE
            return true;
        } else if (liveNeighbourCount > 3) {
            // by overcrowding DEAD
            return false;
        }


        return false;
    }


}
