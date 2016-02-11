package com.sarwar.gameoflife.model;

import com.sarwar.gameoflife.model.base.BaseCell;

public class GenerationInfo {

    private BaseCell cell;

    private int liveNeighboursCount;

    //

    //

    //

    public BaseCell getCell() {
        return cell;
    }

    public void increaseLiveNeighboursCount() {
        liveNeighboursCount++;
    }

    public void decreaseLiveNeighboursCount() {
        liveNeighboursCount--;
    }

    public int getLiveNeighboursCount() {
        return liveNeighboursCount;
    }


    public void setCell(BaseCell cell) {
        this.cell = cell;
    }

    public void setLiveNeighboursCount(int liveNeighboursCount) {
        this.liveNeighboursCount = liveNeighboursCount;
    }
}
