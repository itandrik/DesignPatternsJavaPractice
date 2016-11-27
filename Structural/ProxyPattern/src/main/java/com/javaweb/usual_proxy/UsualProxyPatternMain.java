package com.javaweb.usual_proxy;

/**
 * It is main class for creating sample of proxy pattern.
 * Here we create model of game "sapper".
 *
 * @author Andrii Chernysh
 */
public class UsualProxyPatternMain {
    public static final int FIELD_SIZE = 10;
    public static void main(String[] args) {
        Cell [][]cells = new Cell[FIELD_SIZE][FIELD_SIZE];
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                if(i+j %2 == 0){
                    cells[i][j] = new MineProxy(i,j);
                } else {
                    cells[i][j] = new EmptyProxy(i,j);
                }
            }
        }
        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                cells[i][j].open();
            }
        }
    }
}
