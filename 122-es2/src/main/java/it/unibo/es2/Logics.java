package it.unibo.es2;


public interface Logics {
    

    /**
     * @param row
     * @param column
     * @return
     */
    boolean hit(int row, int column);

    /**
     * @return
     */
    boolean isAnyRowFull();

    /**
     * @return
     */
    boolean isAnyColumnFull();

}
