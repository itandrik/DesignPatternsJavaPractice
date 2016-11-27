package com.javaweb.usual_proxy;

/**
 * Concrete cell, which extends {@link Cell}
 * It is empty cell.
 *
 * @author Andrii Chernysh
 */
public class EmptyCell extends Cell{

    public EmptyCell(int left, int top) {
        super(left, top);
    }

    @Override
    public int getPoints() {
        return 10;
    }
}
