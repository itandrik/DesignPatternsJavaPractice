package com.javaweb.usual_proxy;

/**
 * Concrete cell, which extends {@link Cell}
 * It is proxy for mine cell.
 *
 * @author Andrii Chernysh
 */
public class MineProxy extends Cell{
    private MineCell proxy;

    public MineProxy(int left, int top) {
        super(left, top);
        this.proxy = null;
    }

    @Override
    public int getPoints() {
        if (proxy == null) {
            return 100;
        } else {
            return proxy.getPoints();
        }
    }

    @Override
    public void open() {
        if (proxy == null) {
            proxy = new MineCell(left, top);
        }

        proxy.open();
    }

    @Override
    public int getStatus() {
        if (proxy == null) {
            return status;
        } else {
            return proxy.getStatus();
        }
    }

    @Override
    public int getLeft() {
        if (proxy == null) {
            return left;
        } else {
            return proxy.getLeft();
        }

    }

    @Override
    public int getTop() {
        if (proxy == null) {
            return top;
        } else {
            return proxy.getTop();
        }
    }
}
