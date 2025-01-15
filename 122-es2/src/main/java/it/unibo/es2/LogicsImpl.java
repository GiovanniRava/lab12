package it.unibo.es2;

import java.util.*;
import java.util.stream.IntStream;

public class LogicsImpl implements Logics{
    private List<List<Boolean>> grid = new ArrayList<>();
   
    public LogicsImpl(int size) {
        for(int i=0; i<size; i++){
            final List<Boolean> row = new ArrayList<>();
            this.grid.add(row);
            for (int j=0;j<size; j++){
                row.add(false);
            }
        }
    }
    private boolean gridGet(int row, int column){
        return this.grid.get(row).get(column);
    }

    @Override
    public boolean hit(int row, int column) {
        final boolean val = !this.gridGet(row, column);
        this.grid.get(row).set(column, val);
        return val;
    }

    @Override
    public boolean isAnyRowFull() {
        return this.grid.stream().anyMatch(i->i.stream().allMatch(b->b));
    }

    @Override
    public boolean isAnyColumnFull() {
        return IntStream.range(0, grid.size())
        .anyMatch(index -> this.grid.stream()
        .allMatch(l->l.get(index)));
    }

}
