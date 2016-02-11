package com.sarwar.gameoflife.observer;

import com.sarwar.gameoflife.enums.CellState;


public abstract class Observer {


    // method to update the observer, used by subject
    public abstract void update(CellState state,boolean isUpdateCurrent);

}
