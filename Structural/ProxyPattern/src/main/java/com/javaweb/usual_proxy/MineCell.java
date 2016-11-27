package com.javaweb.usual_proxy;

/**
 * Concrete cell, which extends {@link Cell}
 * It is cell with mine.
 *
 * @author Andrii Chernysh
 */
public class MineCell extends Cell {
    public MineCell(int left, int top) {
        super(left, top);
    }

    @Override
    public int getPoints() {
        return 100;
    }
}
