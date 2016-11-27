package com.javaweb.usual_proxy;

/**
 * Abstract class of cell in our game
 */
public abstract class Cell {
    public static final int OPENED_CELL = 0;
    public static final int CLOSED_CELL = 1;

    protected int status;

    protected int left;
    protected int top;

    public Cell(int left, int top) {
        this.left = left;
        this.top = top;
        status = CLOSED_CELL;
    }

    public void open(){
        this.status = OPENED_CELL;
    }

    public int getStatus() {
        return status;
    }

    public int getLeft() {
        return left;
    }

    public int getTop() {
        return top;
    }

    public abstract int getPoints();
}
